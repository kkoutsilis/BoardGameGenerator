package org.example.model.squares;

import com.fasterxml.jackson.annotation.*;
import org.example.Game;


public class SquareMovement implements Square {
    private int steps;

    @JsonCreator
    public SquareMovement(@JsonProperty("steps") int steps) {
        this.steps = steps;
    }

    public SquareMovement() {
    }

    @Override
    public void action(Game game) {
        game.moveCurrentPayer(steps);
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        return "Wow, you move " + steps + " squares";
    }

    @JsonGetter
    public int getSteps() {
        return steps;
    }

    @JsonSetter
    public void setSteps(int steps) {
        this.steps = steps;
    }
}
