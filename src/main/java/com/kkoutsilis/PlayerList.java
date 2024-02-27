package com.kkoutsilis;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.model.Player;
import com.kkoutsilis.model.squares.Square;

public class PlayerList {
    private LinkedList<Player> playersList = new LinkedList<>();
    private Player currentPlayer;

    public PlayerList(List<Player> playerList) {
        this.playersList = (LinkedList<Player>) playerList;
        currentPlayer = this.playersList.poll();
    }

    public PlayerList(Player currentPlayer, LinkedList<Player> playerList) {
        this.currentPlayer = currentPlayer;
        this.playersList = playerList;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    @JsonIgnore
    public Player getNextPlayer() {
        if (currentPlayer != null) {
            playersList.offer(currentPlayer);
        }
        currentPlayer = playersList.poll();
        if (!currentPlayer.isPlayersTurn()) {
            currentPlayer.setPlayersTurn(true);
            return getNextPlayer();
        } else {
            return currentPlayer;
        }
    }

    @JsonIgnore
    public Player removePlayer() {
        playersList.offer(currentPlayer);
        currentPlayer = null;
        return playersList.pollLast();

    }

    @JsonIgnore
    public Square getCurrentPlayersSquare() {
        return currentPlayer.getCurrentSquare();
    }

    @JsonIgnore
    public void currentPlayerLoseTurn() {
        currentPlayer.setPlayersTurn(false);
    }

    public LinkedList<Player> getPlayerLinkedList() {
        return playersList;
    }

    public void setPlayer(Player player) {
        if (playersList.isEmpty() && currentPlayer == null) {
            currentPlayer = player;
        } else {
            playersList.offer(player);
        }
    }

    public void setPlayerList(List<Player> playerList) {
        this.playersList = (LinkedList<Player>) playerList;
        currentPlayer = this.playersList.poll();
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
