package com.kkoutsilis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kkoutsilis.model.squares.SimpleSquare;
import com.kkoutsilis.model.squares.Square;
import com.kkoutsilis.model.squares.SquareMovement;

public class ListCreatorSnake {

    private Random random = new Random();

    public List<Square> getSnakeList(int numOfSquares) {
        List<Square> squareList = new ArrayList<>();
        int steps;
        int movementSquaresProbability = (int) (numOfSquares * 0.08);
        List<Integer> squaresForwardList = new ArrayList<>();
        List<Integer> squaresBackwardList = new ArrayList<>();
        for (int i = 0; i < movementSquaresProbability; i++) {
            squaresBackwardList.add(
                    this.random.nextInt(numOfSquares - ((int) (numOfSquares * 0.15)) + ((int) (numOfSquares * 0.15))));
            squaresForwardList.add(
                    this.random.nextInt(numOfSquares - ((int) (numOfSquares * 0.15)) + ((int) (numOfSquares * 0.15))));
            if (squaresBackwardList.contains(squaresForwardList.get(i))) {
                squaresForwardList.set(i, this.random
                        .nextInt(numOfSquares - ((int) (numOfSquares * 0.15)) + ((int) (numOfSquares * 0.15))));
            }
        }
        for (int i = 0; i < numOfSquares; i++) {
            squareList.add(new SimpleSquare());
        }
        for (int i = (int) (numOfSquares * 0.15); i < numOfSquares - (int) (numOfSquares * 0.15); i++) {
            if (squaresForwardList.contains(i)) {
                steps = this.random.nextInt(10 - 5) + 5;
                squareList.set(i, new SquareMovement(steps));
            }
            if (squaresBackwardList.contains(i)) {
                steps = this.random.nextInt(10 - 5) + 5;
                squareList.set(i, new SquareMovement(steps));
            }
        }
        return squareList;
    }
}
