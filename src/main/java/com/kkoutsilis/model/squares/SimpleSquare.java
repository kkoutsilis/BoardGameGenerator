package com.kkoutsilis.model.squares;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kkoutsilis.Game;

public class SimpleSquare implements Square {

    @JsonCreator
    public SimpleSquare() {
        // Simple square without any functionality
    }

    @JsonIgnore
    public void action(Game game) {
        // No action required for SimpleSquare
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        return "";
    }

}
