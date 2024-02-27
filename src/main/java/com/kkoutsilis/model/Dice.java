package com.kkoutsilis.model;

import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfDices;
    private int diceCapacity;

    public Dice(int numberOfDices, int diceCapacity) {
        this.numberOfDices = numberOfDices;
        this.diceCapacity = diceCapacity;
    }

    public Dice() {
        this(0, 0);
    }

    public int rollDice() {
        int minLimit = 1;
        return (this.random.nextInt(numberOfDices * diceCapacity) + minLimit);
    }

    public int getNumberOfDices() {
        return numberOfDices;
    }

    public void setNumberOfDices(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    public int getDiceCapacity() {
        return diceCapacity;
    }

    public void setDiceCapacity(int diceCapacity) {
        this.diceCapacity = diceCapacity;
    }
}
