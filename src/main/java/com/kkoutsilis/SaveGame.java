package com.kkoutsilis;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class SaveGame {
    public void save(Game game) throws IOException {
        //TODO: MUST FIX SERIALIZATION TO WORK PROPERLY
        GameConfiguration gameConfiguration = new GameConfiguration();
        gameConfiguration.setBoard(game.getBoard());
        gameConfiguration.setCurrentPlayer(game.getCurrentPlayer());
        gameConfiguration.setPlayerList(game.getPlayerLinkedList());
        gameConfiguration.setCondition(game.getCondition());
        gameConfiguration.setCardDeck(game.getCardDeck());
        gameConfiguration.setDice(game.getDice());

        ObjectMapper mapper = new ObjectMapper();
        String savedGame = mapper.writeValueAsString(gameConfiguration);
        try {
            FileWriter myWriter = new FileWriter("save.json");
            myWriter.write(savedGame);
            myWriter.close();
            System.out.println("Successfully saved the game.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the game.");
            e.printStackTrace();
        }
    }
}
