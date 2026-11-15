package com.solidprinciples.ocp.correct;

public class CCSerivce implements PaymentService{
    @Override 
    public void processPayment(){
        System.out.println("CC Payment");
    }
}
