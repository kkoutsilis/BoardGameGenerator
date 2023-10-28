package com.kkoutsilis.model.cards;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.Game;

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
