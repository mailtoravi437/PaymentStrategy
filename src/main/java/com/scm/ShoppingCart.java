package com.scm;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    PaymentStrategy paymentStrategy;

    ShoppingCart(){
        items = new ArrayList<>();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void checkout(){
        int totalAmount = items.stream().mapToInt(Item::getPrice).sum();
//        for(int i=0;i<items.size();i++){
//            totalAmount += items.get(i).getPrice();
//        }
        paymentStrategy.pay(totalAmount);
    }


}
