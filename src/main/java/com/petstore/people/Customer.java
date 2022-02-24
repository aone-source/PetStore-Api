package com.petstore.people;

import java.util.ArrayList;

public class Customer<I> extends Person {
    private ArrayList<I> purchases;

    Customer(String fullName, Integer age, String email) {
        super(fullName, age, email);
    }

    public void addToPurchases(I item) {
        purchases.add(item);
    }

    public ArrayList<I> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<I> purchases) {
        this.purchases = purchases;
    }

    public void clearPurchases(I item) {
        purchases.clear();
    }
}
