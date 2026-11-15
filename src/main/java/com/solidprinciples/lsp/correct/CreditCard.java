package com.solidprinciples.lsp.correct;

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
