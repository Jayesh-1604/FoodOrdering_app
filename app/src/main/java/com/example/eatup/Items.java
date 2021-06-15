package com.example.eatup;

public class Items {
    private String ItemName;
    private String ItemPrice;

    public Items( String itemName, String itemPrice) {
        ItemName = itemName;
        ItemPrice = itemPrice;
    }


    public String getItemName() {
        return ItemName;
    }

    public String getItemPrice() {
        return ItemPrice;
    }
}