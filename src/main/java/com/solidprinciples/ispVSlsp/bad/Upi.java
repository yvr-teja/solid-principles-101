package com.solidprinciples.ispVSlsp.bad;

public class Upi implements Payment{
    @Override 
    public void pay(Double amount){
        System.out.println("UPI Payment Done");
    }

    public void chaeckBalance(){
        System.out.println("Checking UPI Balance ");
    }
}