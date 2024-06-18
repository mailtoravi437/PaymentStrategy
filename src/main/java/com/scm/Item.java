package com.scm;

import lombok.Data;

public class Item {
    private final String name;
    private final int price;

    Item(String name,int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
