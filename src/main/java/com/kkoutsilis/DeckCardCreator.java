package com.kkoutsilis;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

import com.kkoutsilis.model.cards.Card;
import com.kkoutsilis.model.cards.CardLoseTurn;
import com.kkoutsilis.model.cards.CardPower;

public class DeckCardCreator {
    private Random random = new Random();

    public LinkedList<Card> getDeckOfCard() {
        LinkedList<Card> deckOfCards = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            deckOfCards.push(new CardLoseTurn());
        }

        for (int i = 10; i < 20; i++) {
            deckOfCards.push(new CardPower(this.random.nextInt(13) + 1));
        }
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
}
