package com.solidprinciples.lsp.bad;

public class CreditCard implements Payment{

    @Override
    public void pay() {
        System.out.println("Credit Card Payement Done");
    }

    @Override
    public void refund() {
        System.out.println("Creadit Card Refund Done");
    }
    
    
}
