package com.petstore.duties;

public class Stocker extends Duty{
    public Stocker() {
        super("Stocker");
    }

    @Override
    public String performDuty() {
        return stockedUp();
    }

    private String stockedUp(){
        return getName() + " : all stocked";
    }
}
