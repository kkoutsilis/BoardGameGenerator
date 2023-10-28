package org.example.model.cards;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.Game;

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
