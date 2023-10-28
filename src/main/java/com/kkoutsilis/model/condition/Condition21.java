package com.kkoutsilis.model.condition;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.Game;
import com.kkoutsilis.Status;
import com.kkoutsilis.model.Messages;
import com.kkoutsilis.model.Player;
import com.kkoutsilis.model.SimpleMessages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Condition21 implements Condition {
    private final int limit = 21;
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
        if (player.getPower() > limit) {
            messages.loseMessage();
            executedPlayers.add(game.getPlayerList().removePlayer());
        } else {
            messages.continueMessage();
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")) {
                pausedPlayers.add(game.getPlayerList().removePlayer());
            }
        }
        if (game.getPlayerLinkedList().size() == 0 && game.getPlayerList().getCurrentPlayer() == null || game.getCardDeck().isEmpty()) {
            return Status.FINISH;
        } else {
            return Status.PLAY;
        }
    }

    @Override
    public void showWinner() {
        Messages messages = new SimpleMessages();
        if (pausedPlayers.size() != 0) {
            winner = pausedPlayers.get(0);
            int min = abs(winner.getPower() - limit);
            for (Player player1 : pausedPlayers) {
                if (abs(player1.getPower() - limit) < min) {
                    min = abs(player1.getPower() - limit);
                    winner = player1;
                }
            }
            messages.winnerEvent(winner);
        }
        messages.pausedPlayersEvent(pausedPlayers);
        messages.executedPlayersEvent(executedPlayers);
    }

}
