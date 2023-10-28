package com.kkoutsilis.model.cards;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.kkoutsilis.Game;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

@JsonTypeInfo(use = NAME, include = PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CardLoseTurn.class, name = "CardLoseTurn"),
        @JsonSubTypes.Type(value = CardPower.class, name = "CardPower"),
        @JsonSubTypes.Type(value = CardColor.class, name = "CardColor")
})
public interface Card {
    void action(Game game);

    String getMessage();
}
