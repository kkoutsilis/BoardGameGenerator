package com.kkoutsilis.model.squares;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.Game;

public class SquareLoseTurn implements Square {

    @JsonCreator
    public SquareLoseTurn() {
    }

    @Override
    public void action(Game game) {
        game.currentPlayerLoseTurn();
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        return "Oops, you lose one turn";
    }

}
