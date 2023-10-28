package org.example.model.cards;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.Game;

public class CardLoseTurn implements Card {
    public CardLoseTurn() {
    }

    @Override
    public void action(Game game) {
        game.currentPlayerLoseTurn();
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        return "Oops, you lose your turn, better luck next time.";
    }
}
