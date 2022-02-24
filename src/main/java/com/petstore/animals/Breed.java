package com.petstore.animals;

public enum Breed {
    CANARY(1, 10), LOVEBIRD(2,10), PARROT(3,10), HUMMINGBIRD(4,10), DOVE(5,10),
    PITBULL(6, 10), BOXER(7,10), BULLDOG(8,10), POODLE(9,10), YORKIE(10,10);

    private Integer itemNumber;
    private Integer price;

    Breed(Integer itemNumber, Integer price){}

    public Integer getItemNumber() {
        return itemNumber;
    }

    public Integer getPrice() {
        return price;
    }
}
