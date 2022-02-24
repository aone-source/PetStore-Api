package com.petstore.animals;
import com.petstore.things.Food;

public interface Animal {

    Integer getNumberOfMealsEaten();

    Integer getId();

    void eat(Food food);
}
