package org.example.model.players;

import org.example.model.squares.Square;

public  class Player {
    private String name;
    private Square currentSquare;
    private boolean playersTurn=true;
    private int power=0;


    public Player(String name,Square currentSquare) {
        this.name = name;
        this.currentSquare=currentSquare;
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
    public void powerUp(int power){
        this.power+=power;
    }
    public int getPower(){
        return power;
    }
    public void action(){}


    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
