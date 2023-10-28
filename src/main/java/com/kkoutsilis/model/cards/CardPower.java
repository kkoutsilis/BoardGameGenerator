package com.kkoutsilis.model.cards;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.Game;
import com.kkoutsilis.model.Player;

public class CardPower implements Card {
    private int power;

    public CardPower(int power) {
        this.power = power;
    }

    public CardPower() {
    }

    @Override
    public void action(Game game) {
        Player player = game.getCurrentPlayer();
        player.powerUp(power);
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        return "It's a PowerSquare , you get " + power + " Power";
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
