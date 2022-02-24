package com.petstore.people;

import java.util.ArrayList;

public class Customer<I> extends Person {

    private ArrayList<I> purchases;

    Customer(String fullName, Integer age, String email) {super(fullName, age, email);
        this.purchases = new ArrayList<>();
    }

    public void addToPurchases(I item) {
        purchases.add(item);
    }

    public void removePurchases(I item) {
        purchases.remove(item);
    }

    public ArrayList<I> getPurchases() {
        return purchases;
    }

    public void clearPurchases(I item) {
        purchases.clear();
    }



}
