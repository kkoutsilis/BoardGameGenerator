package com.kkoutsilis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kkoutsilis.model.squares.SimpleSquare;
import com.kkoutsilis.model.squares.Square;
import com.kkoutsilis.model.squares.SquareCard;

public class ListCreator21 {
    private Random random = new Random();

    public ListCreator21() {
    }

    public List<Square> get21List(int numOfSquares) {
        // TODO add SquareLoseTurn
        List<Square> squareList = new ArrayList<>();
        List<Integer> cardList = new ArrayList<>();
        for (int i = 0; i < numOfSquares / 2; i++) {
            cardList.add(this.random.nextInt(numOfSquares - 1) + 1);
        }
        for (int i = 0; i < numOfSquares; i++) {
            if (cardList.contains(i)) {
                squareList.add(new SquareCard());
            } else {
                squareList.add(new SimpleSquare());
            }
        }
        return squareList;
    }
}
