package com.petstore.animals;

import com.petstore.items.Food;

import java.util.ArrayList;

public abstract class Animal {
    private static Integer idIndex = 1;
    private final Integer id;
    private Integer age;
    private Integer price = 20;
    private Breed breed;


    public Animal(Integer age, Breed breed) {
        this.age = age;
        this.breed = breed;
        this.price = price;
        this.id = idIndex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void setIdIndex(Integer update) {
        idIndex  = update;
    }

    public Integer getId() {
        return id;
    }
}


