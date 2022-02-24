package com.petstore.animals;

import com.petstore.items.Food;

import java.util.ArrayList;

public abstract class Animals {
    private Integer age;
    private static Integer idIndex = 1;
    private final Integer id;
    private Breed breed;
    private ArrayList<Food> eatenMeals;

    public Animals(Integer age) {
        this.age = age;
        this.breed = breed;
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

    public static void setIdIndex(Integer update) {
        idIndex  = update;
    }

    public Integer getId() {
        return id;
    }
}


