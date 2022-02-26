package com.petstore.items;
import com.petstore.animals.Breed;
import com.petstore.animals.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PurchaseTest {
    Pet pet = new Pet(1, Breed.CANARY, 10);
    Item item = new Item(ItemEnum.BIRD_CAGE, 10);
    Purchase purchase = new Purchase(pet, item);

    @Test
    public void constructorTest(){
        String expected = "Purchase: Animal: Breed:CANARY, Id: 1, Age: 1, Price: 10 Item: BIRD_CAGE, Price: 10 Dollars";
        String actual = purchase.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPetTest(){
        Pet expected = pet;
        Pet actual = purchase.getPet();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setPetTest(){
        Pet expected = pet;
        purchase.setPet(pet);
        Pet actual = purchase.getPet();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getItemTest(){
        Item expected = item;
        Item actual = purchase.getItem();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setItemTest(){
        Item expected = item;
        purchase.setItem(item);
        Item actual = purchase.getItem();

        Assertions.assertEquals(expected,actual);
    }
}