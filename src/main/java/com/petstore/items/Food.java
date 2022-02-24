package com.petstore.items;

public enum  Food {
    DOG_FOOD(1, 10), PREMIUM_DOG_FOOD(2,20), BIRD_FOOD(3,10),
    PREMIUM_BIRD_FOOD(4, 20);
    private Integer itemNumber;
    private Integer price;

    Food(Integer itemNumber, Integer price) {
        this.itemNumber = itemNumber;
        this.price = price;
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
