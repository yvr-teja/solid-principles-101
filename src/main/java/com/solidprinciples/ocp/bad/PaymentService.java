package com.solidprinciples.ocp.bad;

public class PaymentService {
    public void processPayment(String payType) {
        if (payType.equals("UPI")) {
            System.out.println("Processing UPI payment");
        } else if (payType.equals("CC")) {
            System.out.println("Processing CC Payment");
        } else if (payType.equals("NETBANKING")) {
            System.out.println("Processing NetBanking Payment");
        }
    }
}
