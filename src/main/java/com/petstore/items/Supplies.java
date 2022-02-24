package com.petstore.items;
import java.util.ArrayList;

public class Supplies <I>{
    private ArrayList<I> inventory;

    public void addToInventory(I item) {
        inventory.add(item);
    }

    public void removeInventory(I item) {
        inventory.remove(item);
    }

    public void clearInventory(I item) {
        inventory.clear();
    }

    public ArrayList<I> getInventory() {return inventory;}
}
