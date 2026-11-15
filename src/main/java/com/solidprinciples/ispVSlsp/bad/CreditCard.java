package com.solidprinciples.ispVSlsp.bad;

public class CreditCard implements Payment{
    
    @Override 
    public void pay(Double amount){

        if (amount>1000000) {
            throw new UnsupportedOperationException("Amount limit exceeded");
        }
        System.out.println("CC Payment Done ");
    }
}
