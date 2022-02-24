package com.petstore.animals;

public enum BirdBreed {
    CANARY(1, 10), LOVEBIRD(2,10), PARROT(3,10), HUMMINGBIRD(4,10), DOVE(5,10);
    private Integer itemNumber;
    private Integer price;


    BirdBreed (Integer itemNumber, Integer price){}


    public Integer getItemNumber() {
        return itemNumber;
    }

    public Integer getPrice() {
        return price;
    }
}
