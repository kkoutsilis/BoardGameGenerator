package org.example.model.squares;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.games.Game;
import org.example.model.boards.BoardCircular;
import org.example.model.boards.BoardLine;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;


@JsonTypeInfo(use = NAME, include = PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SimpleSquare.class, name = "SimpleSquare"),
        @JsonSubTypes.Type(value = SquareMovement.class, name = "SquareMovement"),
        @JsonSubTypes.Type(value = SquareCard.class, name = "SquareCard"),
        @JsonSubTypes.Type(value =  SquareLoseTurn.class, name = "SquareLoseTurn")
})
public interface Square {
    void action(Game game);
    String getMessage();

}
