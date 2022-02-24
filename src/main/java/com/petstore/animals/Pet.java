package com.petstore.animals;

import java.util.ArrayList;

public  class Pet extends Animal {
    private static ArrayList<Animal> pets = new ArrayList<>();

    public Pet(Integer age, Breed breed) {
        super(age, breed);
    }


    public static void add(Pet pet){pets.add(pet);}
    public static void remove(Integer index){pets.remove(index);}
    public static Integer getAnimalById(Integer id, Integer index){return null;}
    public static Integer getNumberOfPets() {return pets.size();}
    public static void clear() {
        pets.clear();
    }












}

