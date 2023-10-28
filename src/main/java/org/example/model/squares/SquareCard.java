package org.example.model.squares;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.example.Game;
import org.example.model.cards.Card;

public class SquareCard implements Square {
    private Card card;

    public SquareCard() {
    }

    @Override
    public void action(Game game) {
        card = game.getCard();
        card.action(game);
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        try {
            return card.getMessage();
        } catch (Exception e) {
            return "There is no card";
        }
    }

}
