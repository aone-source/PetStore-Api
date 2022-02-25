package com.petstore.animals;

import java.util.concurrent.ForkJoinWorkerThread;

public abstract class Animal {
    private static Integer idIndex = 1;
    private final Integer id;
    private Integer age;
    private Integer price;
    private Breed breed;


    public Animal(Integer age, Breed breed, Integer price) {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Breed:" + breed +
                ", Id: " + id +
                ", Age: " + age +
                ", Price: " + price;
    }
}


