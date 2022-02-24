package com.petstore.items;

public enum Services {
    GROOMING(1,20), TRAINING(2,20);
    private Integer itemNumber;
    private Integer price;

    Services(Integer itemNumber, Integer price) {
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
