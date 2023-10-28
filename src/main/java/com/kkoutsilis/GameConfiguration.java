package com.kkoutsilis;

import com.kkoutsilis.model.Dice;
import com.kkoutsilis.model.Player;
import com.kkoutsilis.model.boards.Board;
import com.kkoutsilis.model.cards.Card;
import com.kkoutsilis.model.condition.Condition;

import java.util.LinkedList;

public class GameConfiguration {
    private Board board;
    private Condition condition;
    private LinkedList<Player> playerList;
    private Player currentPlayer;
    private LinkedList<Card> cardDeck;
    private Dice dice;

    public GameConfiguration(Board board, Condition condition, LinkedList<Player> playerList, Player currentPlayer, LinkedList<Card> cardDeck, Dice dice) {
        this.board = board;
        this.condition = condition;
        this.playerList = playerList;
        this.currentPlayer = currentPlayer;
        this.cardDeck = cardDeck;
        this.dice = dice;
    }

    public GameConfiguration() {
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public LinkedList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(LinkedList<Player> playerList) {
        this.playerList = playerList;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public LinkedList<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(LinkedList<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
