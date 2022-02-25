package com.petstore.people;
import com.petstore.animals.Breed;
import com.petstore.animals.Pet;
import com.petstore.items.Item;
import com.petstore.items.ItemEnum;
import com.petstore.items.Purchase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    Pet pet = new Pet(1, Breed.CANARY, 10);
    Item item = new Item(ItemEnum.BIRD_CAGE, 10);
    Purchase purchase = new Purchase(pet, item);
    Customer customer = new Customer("Michelle McCool", 32, "michelle@petstore.com",purchase);

    @BeforeEach
    public void setUp (){
        Customer.setIdIndex(0);
    }

    @Test
    public void constructorTest() {
        String expected = "Customer: Michelle McCool Purchase: Animal: Breed:CANARY, Id: 1, Age: 1, Price: 20 Item: BIRD_CAGE, Price: 10 Dollars";
        String actual = customer.toString();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest() {
        String expected = "Michelle McCool";
        String actual = customer.getFullName();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Michelle McCool";
        customer.setFullName("Michelle McCool");
        String actual = customer.getFullName();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void getAgeTest() {
        Integer expected = 32;
        Integer actual = customer.getAge();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setAgeTest() {
        Integer expected = 32;
        customer.setAge(32);
        Integer actual = customer.getAge();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getEmailTest() {
        String expected = "michelle@petstore.com";
        String actual = customer.getEmail();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setEmailTest() {
        String expected = "michelle@petstore.com";
        customer.setEmail("michelle@petstore.com");
        String actual = customer.getEmail();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getPurchaseTest() {
        Purchase expected = purchase;
        Purchase actual = customer.getPurchase();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setPurchase() {
        Purchase expected = purchase;
        customer.setPurchase(purchase);
        Purchase actual = customer.getPurchase();

        Assertions.assertEquals(expected,actual);
    }
}
