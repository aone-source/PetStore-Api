package com.petstore.items;
import com.petstore.animals.Pet;

public class Purchase {
    private Pet pet;
    private Item item;

    public Purchase(Pet pet, Item item) {
        this.pet = pet;
        this.item = item;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


    @Override
    public String toString() {
        return "Purchase: " +
                "Animal: " + getPet() +
                " " + getItem() ;
    }
}
