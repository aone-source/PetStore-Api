package com.petstore.items;

public class Item {
    private static Integer stockIndex = 10;
    private Integer stock;
    private ItemEnum item;
    private Integer price;


    public Item(ItemEnum item, Integer price) {
        this.item = item;
        this.price = price;
        this.stock = stockIndex;
        stockIndex--;
    }

    public ItemEnum getItem() {
        return item;
    }

    public void setItem(ItemEnum item) {
        this.item = item;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void loadStock() {
        stock += 10;
    }

    public static void setStockIndex(Integer update) {
        stockIndex = update;
    }

    @Override
    public String toString() {
        return "Item: " + item + ", Price: " + price + " Dollars";
    }
}

