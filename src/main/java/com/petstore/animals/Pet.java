package com.petstore.animals;

import java.util.ArrayList;

public  class Pet extends Animals {
    private static ArrayList<Animals> pets = new ArrayList<>();

    public Pet(Integer age) {super(age);}

    public static void add(Pet pet){pets.add(pet);}
    public static void remove(Integer index){pets.remove(index);}
    public static Integer getAnimalById(Integer id, Integer index){return null;}
    public static Integer getNumberOfPets() {return pets.size();}
    public static void clear() {
        pets.clear();
    }












}

