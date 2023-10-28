package com.kkoutsilis.model.condition;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.Game;
import com.kkoutsilis.Status;
import com.kkoutsilis.model.Messages;
import com.kkoutsilis.model.Player;
import com.kkoutsilis.model.SimpleMessages;
import com.kkoutsilis.model.boards.Board;

public class ConditionSnake implements Condition {
    private Player winner;

    public ConditionSnake() {
    }

    @JsonIgnore
    @Override
    public Status getCondition(Game game) {
        Player player = game.getCurrentPlayer();
        Board board = game.getBoard();

        if (player.getCurrentSquare() == board.getLastSquare()) {
            winner = player;
            return Status.FINISH;
        } else {
            return Status.PLAY;
        }
    }

    @Override
    public void showWinner() {
        Messages messages = new SimpleMessages();
        messages.winnerEvent(winner);
    }

}
