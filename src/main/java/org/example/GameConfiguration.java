package org.example;

import org.example.model.Dice;
import org.example.model.boards.Board;
import org.example.model.cards.Card;
import org.example.model.players.Player;
import org.example.model.successCondition.Condition;

import java.util.LinkedList;

public class GameConfiguration {
    private Board board;
    private Condition successCondition;
    private LinkedList<Player> playerList;
    private Player currentPlayer;
    private LinkedList<Card> cardDeck;
    private Dice dice;

    public GameConfiguration(Board board, Condition successCondition, LinkedList<Player> playerList, Player currentPlayer, LinkedList<Card> cardDeck, Dice dice) {
        this.board = board;
        this.successCondition = successCondition;
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

    public Condition getSuccessCondition() {
        return successCondition;
    }

    public void setSuccessCondition(Condition successCondition) {
        this.successCondition = successCondition;
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
