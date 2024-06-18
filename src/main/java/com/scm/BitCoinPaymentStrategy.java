package com.scm;

public class BitCoinPaymentStrategy implements PaymentStrategy{
    private final String walletAddress;
    BitCoinPaymentStrategy(String walletAddress){
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount+" using Bitcoin");
    }
}
