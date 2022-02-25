package com.petstore.items;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ItemTest {

    Item birdcage = new Item(ItemEnum.BIRD_CAGE,10);

    @BeforeEach
    public void setUp (){
        Item.setStockIndex(10);
    }

    @Test
    public void constructorTest(){
        String expected = "Item: BIRD_CAGE, Price: 10 Dollars";
        String actual = birdcage.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getItemTest(){
        ItemEnum expected = ItemEnum.BIRD_CAGE;
        ItemEnum actual = birdcage.getItem();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setItemTest(){
        ItemEnum expected = ItemEnum.BIRD_CAGE;
        birdcage.setItem(ItemEnum.BIRD_CAGE);
        ItemEnum actual = birdcage.getItem();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getPriceTest(){
        Integer expected = 10;
        Integer actual = birdcage.getPrice();

        Assertions.assertEquals(expected,actual);
    }
    
    @Test
    public void setPriceTest(){
        Integer expected = 10;
        birdcage.setPrice(10);
        Integer actual = birdcage.getPrice();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getStockTest(){
        Integer expected = 10;
        Integer actual = birdcage.getStock();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStockTest(){
        Integer expected = 10;
        birdcage.setStock(10);
        Integer actual = birdcage.getStock();

        Assertions.assertEquals(expected,actual);
    }
}



