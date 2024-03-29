package com.kkoutsilis.model.messages;

import com.kkoutsilis.Game;
import com.kkoutsilis.model.Player;
import com.kkoutsilis.model.squares.Square;

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
