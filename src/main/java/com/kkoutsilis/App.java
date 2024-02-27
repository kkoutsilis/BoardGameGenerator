package com.kkoutsilis;

import java.io.File;
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        try {
            GameConfiguration gameConfiguration = new ObjectMapper()
                    .readValue(new FileReader(new File("games/game21.json")), GameConfiguration.class);
            Game game = new Game(gameConfiguration);
            game.startGame();
        } catch (Exception e) {
            System.out.println("Problem reading game");
        }

    }
}
