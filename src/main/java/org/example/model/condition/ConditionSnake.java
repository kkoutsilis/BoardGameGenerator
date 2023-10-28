package org.example.model.condition;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.Game;
import org.example.Status;
import org.example.model.Messages;
import org.example.model.Player;
import org.example.model.SimpleMessages;
import org.example.model.boards.Board;

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
