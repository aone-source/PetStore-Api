package com.petstore.people;
import com.petstore.items.Purchase;

public class Customer extends Person {
    private Purchase purchase;


    Customer(String fullName, Integer age, String email, Purchase purchase) {
        super(fullName, age, email);
        this.purchase = purchase;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Customer: " + getFullName() + " " + purchase;
    }
}
