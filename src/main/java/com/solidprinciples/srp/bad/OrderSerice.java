package com.solidprinciples.srp.bad;

// Multiple Operations in One class - is wrong approch 
//Readability Decreases
//Harder to Debug
public class OrderSerice {

    //Order Creation logic
    public void createOrder() {
        System.out.println("Order Created");
    }

    //Payment process for Order
    public void processPayment() {
        System.out.println("payment Processed");
    }

    //Send Email for the Order to the Customer
    public void sendEmail() {
        System.out.println("Email Sent");
    }

    //Generate Invoice for the Order
    public void generateInvoice() {
        System.out.println("Invoice Generated");
    }
}
