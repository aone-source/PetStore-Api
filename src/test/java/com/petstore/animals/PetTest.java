package com.petstore.animals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PetTest {
    Pet pet = new Pet(1, Breed.CANARY, 10);

    @BeforeEach
    public void setUp (){
        Pet.setIdIndex(1);
    }

    @Test
    public void constructorTest() {
        String expected = "Breed:CANARY, Id: 1, Age: 1, Price: 10";
        String actual = pet.toString();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getAgeTest() {
        Integer expected = 1;
        Integer actual = pet.getAge();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setAgeTest() {
        Integer expected = 1;
        pet.setAge(1);
        Integer actual = pet.getAge();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void getBreedTest() {
        Breed expected = Breed.CANARY;
        Breed actual = pet.getBreed();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setBreedTest() {
        Breed expected = Breed.CANARY;
        pet.setBreed(Breed.CANARY);
        Breed actual = pet.getBreed();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getPriceTest() {
        Integer expected = 10;
        Integer actual = pet.getPrice();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setPriceTest() {
        Integer expected = 10;
        pet.setPrice(10);
        Integer actual = pet.getPrice();

        Assertions.assertEquals(expected,actual);
    }
}
