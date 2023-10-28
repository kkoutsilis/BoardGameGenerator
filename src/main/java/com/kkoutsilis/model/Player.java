package com.kkoutsilis.model;

import com.kkoutsilis.model.cards.Card;
import com.kkoutsilis.model.squares.Square;

import java.util.List;

public class Player {
    private String name;
    private Square currentSquare;
    private boolean playersTurn = true;
    private int power = 0;
    private List<Card> cardList;


    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Square currentSquare) {
        this.name = name;
        this.currentSquare = currentSquare;
    }

    public Player() {
    }

    public Square getCurrentSquare() {
        return this.currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {

        this.currentSquare = currentSquare;
    }

    public String getName() {
        return name;
    }

    public boolean isPlayersTurn() {
        return playersTurn;
    }

    public void setPlayersTurn(boolean playersTurn) {
        this.playersTurn = playersTurn;
    }

    public void powerUp(int power) {
        this.power += power;
    }

    public int getPower() {
        return power;
    }

    public void action() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Card getPlayerCard(int i) {
        return cardList.remove(i);
    }

    public void setPlayerCard(Card card) {
        cardList.add(card);
    }
}
