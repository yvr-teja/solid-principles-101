package com.solidprinciples.lsp.correct;

public class PaymentClient {
    
    public void processTransaction(Payment payment){
        payment.pay();
        payment.refund();
    }

     public void processTransaction(NonRefunablePayment payment){
        payment.pay();
    }
}
