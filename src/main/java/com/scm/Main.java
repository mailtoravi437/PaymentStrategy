package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item apple = new Item("Apple",10);
        Item macbook = new Item("Macbook",70000);

        shoppingCart.addItem(apple);
        shoppingCart.addItem(macbook);

        PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy("1234567890","Ravi","101112","345");
        shoppingCart.setPaymentStrategy(paymentStrategy);
        shoppingCart.checkout();
    }
}