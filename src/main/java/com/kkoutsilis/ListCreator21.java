package com.kkoutsilis;

import com.kkoutsilis.model.squares.SimpleSquare;
import com.kkoutsilis.model.squares.Square;
import com.kkoutsilis.model.squares.SquareCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListCreator21 {
    public ListCreator21() {
    }

    public List<Square> get21List(int numOfSquares) {
        //TODO add SquareLoseTurn
        List<Square> squareList = new ArrayList<>();
        Random random = new Random();
        List<Integer> cardList = new ArrayList<Integer>();
        for (int i = 0; i < numOfSquares / 2; i++) {
            cardList.add(random.nextInt(numOfSquares - 1) + 1);
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
