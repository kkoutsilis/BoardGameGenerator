package org.example.model.cards;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.Game;
import org.example.model.Color;


public class CardColor implements Card {
    private Color color;

    public CardColor(Color color) {
        this.color = color;
    }

    public CardColor() {
    }

    @Override
    public void action(Game game) {
        game.getCurrentPlayer().setPlayerCard(this);
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        return "Its a " + color + " card";
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
