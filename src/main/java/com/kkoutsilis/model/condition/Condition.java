package com.kkoutsilis.model.condition;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.kkoutsilis.Game;
import com.kkoutsilis.Status;

@JsonTypeInfo(use = NAME, include = PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ConditionSnake.class, name = "ConditionSnake"),
        @JsonSubTypes.Type(value = Condition21.class, name = "Condition21"),
})
public interface Condition {
    Status getCondition(Game game);

    void showWinner();
}
