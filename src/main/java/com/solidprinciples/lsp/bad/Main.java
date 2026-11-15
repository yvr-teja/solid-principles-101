package com.solidprinciples.lsp.bad;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaymentClient client= new PaymentClient();

        List<Payment> paymentList= 
        List.of(new CreditCard(), new Upi(), new Crypto());
        for(Payment payment: paymentList){
            client.processTransaction(payment);
        }
    }
}
