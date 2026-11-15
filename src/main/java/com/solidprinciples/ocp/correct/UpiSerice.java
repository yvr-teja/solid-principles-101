package com.solidprinciples.ocp.correct;

public class UpiSerice implements PaymentService{
    @Override 
    public void processPayment(){
        System.out.println("UPI Payment");
    }
}
