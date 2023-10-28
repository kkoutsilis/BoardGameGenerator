package org.example.model;

import org.example.Game;
import org.example.model.squares.Square;

import java.util.List;

public interface Messages {
    void winnerEvent(Player winner);

    void diceResult(int diceNum);

    void movePosition(Game game);

    void whoPlays(Player player);

    void powerMove(int steps);

    void powerChange(int power);

    void turnLose(Player player);

    void squareEvent(Square square);


    void separator();

    void playersPointsEvent(List<Player> playerList);

    void pausedPlayersEvent(List<Player> playerList);

    void executedPlayersEvent(List<Player> playerList);

    void loseMessage();

    void continueMessage();
}
