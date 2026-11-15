package com.solidprinciples.lsp.bad;

public class PaymentClient {
    
    public void processTransaction(Payment payment){
        payment.pay();
        payment.refund();
    }
}
