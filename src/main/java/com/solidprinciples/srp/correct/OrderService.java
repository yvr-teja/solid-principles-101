package com.solidprinciples.srp.correct;

public class OrderService {
    //Order Creation logic
    public void createOrder() {
        System.out.println("Order Created");
    }

    //There is no rule that Orderservice should have only one method
    // It can contain - All the bussiness logic that is related to Order
    public void cancelOrder(){
        System.out.println("Order Cancelled");
    }

    //Update Order
    public void updateOrder(){
        System.out.println("Order Modified");
    }
}
