package com.petstore.items;

public enum Products {
    LEASH(1, 10), DOG_TOY(2, 10), DOG_CRATE(3, 20), PERCH(4, 20), BIRD_TOY(5, 10), BIRD_CAGE(6,20);
    private Integer itemNumber;
    private Integer price;

    Products(Integer itemNumber, Integer price) {
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
