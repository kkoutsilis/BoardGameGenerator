package com.kkoutsilis.model.boards;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kkoutsilis.Game;
import com.kkoutsilis.model.Player;
import com.kkoutsilis.model.squares.Square;

import java.util.List;

import static java.lang.StrictMath.abs;

public class BoardCircular extends Board {
    @JsonCreator
    public BoardCircular(@JsonProperty("squareList") List<Square> squareList) {
        this.squareList = squareList;
    }

    public BoardCircular() {
    }


    @JsonIgnore
    @Override
    public void movePlayer(Game game, int steps) {
        int position;
        Player player = game.getCurrentPlayer();
        position = squareList.indexOf(player.getCurrentSquare());
        position += steps;
        if (position > squareList.size() - 1) {
            int difference;
            difference = abs(this.squareList.indexOf(player.getCurrentSquare()) + steps - this.squareList.size());
            player.setCurrentSquare(this.squareList.get(difference));
        } else {
            player.setCurrentSquare(squareList.get(position));
        }
        player.getCurrentSquare().action(game);
    }
}
