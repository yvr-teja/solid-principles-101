package com.solidprinciples.lsp.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaymentClient client= new PaymentClient();

        List<Payment> paymentList= List.of(
            new CreditCard(), new Upi()
        );
        for(Payment payment: paymentList){
            client.processTransaction(payment);
        }

        NonRefunablePayment nonRefunablePayment=
        new Crypto();
        client.processTransaction(nonRefunablePayment);
    }
}
