package com.scm;

public class PaypalPaymentStrategy implements PaymentStrategy{
    private final String paypalId;
    private final String password;

    PaypalPaymentStrategy(String paypalId,String password){
        this.paypalId = paypalId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Paypal");
    }
}
