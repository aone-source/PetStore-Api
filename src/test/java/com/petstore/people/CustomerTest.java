package com.petstore.people;
import com.petstore.animals.Breed;
import com.petstore.animals.Pet;
import com.petstore.items.Supplies;
import com.petstore.people.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;

public class CustomerTest {
    Customer customer = new Customer("Michelle McCool", 32, "mccool@gmail.com");
    Pet pet = new Pet(1, Breed.CANARY);
    Supplies su



    @BeforeEach
    public void setUp (){
        Customer.setIdIndex(0);
    }
}
