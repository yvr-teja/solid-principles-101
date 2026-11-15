package com.solidprinciples.lsp.correct;

public class Upi implements Payment{

    @Override
    public void pay() {
       System.out.println("UPI Paymen Done");
    }

    @Override
    public void refund() {
        System.out.println("UPI Refund");
    }

    public void checkBalance(){
        System.out.println("Checking UPI Balance ");
    }
    
}
