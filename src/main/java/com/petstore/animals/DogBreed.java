package com.petstore.animals;

public enum DogBreed {
    PITBULL(6, 10), BOXER(7,10), BULLDOG(8,10),
    POODLE(9,10), YORKIE(10,10);
    private Integer itemNumber;
    private Integer price;

    DogBreed (Integer itemNumber, Integer price){}

    public Integer getItemNumber() {
        return itemNumber;
    }

    public Integer getPrice() {
        return price;
    }
}
