package com.solidprinciples.ocp.correct;

public class NetBankingService implements PaymentService{
    
    @Override 
    public void processPayment(){
        System.out.println("NetBanking Payment ");
    }
}
