package com.kkoutsilis.model.condition;

import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.Game;
import com.kkoutsilis.Status;
import com.kkoutsilis.model.Player;
import com.kkoutsilis.model.messages.Messages;
import com.kkoutsilis.model.messages.SimpleMessages;

public class Condition21 implements Condition {
    private static final int LIMIT = 21;
    private List<Player> pausedPlayers = new ArrayList<>();
    private List<Player> executedPlayers = new ArrayList<>();
    private Player winner;

    public Condition21() {
    }

    @JsonIgnore
    @Override
    public Status getCondition(Game game) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Messages messages = new SimpleMessages();
        Player player = game.getCurrentPlayer();
        if (player.getPower() > LIMIT) {
            messages.loseMessage();
            executedPlayers.add(game.getPlayerList().removePlayer());
        } else {
            messages.continueMessage();
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")) {
                pausedPlayers.add(game.getPlayerList().removePlayer());
            }
        }
        scanner.close();
        if (game.getPlayerLinkedList().isEmpty() && game.getPlayerList().getCurrentPlayer() == null
                || game.getCardDeck().isEmpty()) {
            return Status.FINISH;
        } else {
            return Status.PLAY;
        }
    }

    @Override
    public void showWinner() {
        Messages messages = new SimpleMessages();
        if (pausedPlayers.isEmpty()) {
            winner = pausedPlayers.get(0);
            int min = abs(winner.getPower() - LIMIT);
            for (Player player1 : pausedPlayers) {
                if (abs(player1.getPower() - LIMIT) < min) {
                    min = abs(player1.getPower() - LIMIT);
                    winner = player1;
                }
            }
            messages.winnerEvent(winner);
        }
        messages.pausedPlayersEvent(pausedPlayers);
        messages.executedPlayersEvent(executedPlayers);
    }

}
