package com.petstore.people;

import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<ArrayList> purchases;
    Customer(String fullName, Integer age, String email) {
        super(fullName, age, email);
        this.purchases = purchases;
    }

    public ArrayList<ArrayList> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<ArrayList> purchases) {
        this.purchases = purchases;
    }
}
