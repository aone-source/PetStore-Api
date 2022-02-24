package com.petstore.animals;

import com.petstore.things.Food;

import java.util.ArrayList;

public abstract class Pet implements Animal {
    private Integer age;

    private ArrayList<Food> eatenMeals;
    private Integer idIndex = 1;
    private final Integer id;


    public Pet(Integer age) {
        this.age = age;

        this.eatenMeals = new ArrayList<>();
        this.id = idIndex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void eat(Food food) {
        eatenMeals.add(food);
    }

    public Integer getNumberOfMealsEaten() {
        return eatenMeals.size();
    }

    @Override
    public Integer getId() {
        return id;
    }
}

