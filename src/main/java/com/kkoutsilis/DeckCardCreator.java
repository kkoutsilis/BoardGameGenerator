package com.kkoutsilis;

import com.kkoutsilis.model.cards.Card;
import com.kkoutsilis.model.cards.CardLoseTurn;
import com.kkoutsilis.model.cards.CardPower;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class DeckCardCreator {

    public LinkedList<Card> getDeckOfCard() {
        LinkedList<Card> deckOfCards = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            deckOfCards.push(new CardLoseTurn());
        }

        for (int i = 10; i < 20; i++) {
            deckOfCards.push(new CardPower(random.nextInt(13) + 1));
        }
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
}
