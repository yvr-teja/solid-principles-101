package com.solidprinciples.lsp.bad;

public class Crypto implements Payment{

    @Override
    public void pay() {
        System.out.println("Crypto Payment Done");
    }

    //It is not fully Implementing all the Method of parent 
    //Hence It is breaking the Leskov 
    @Override
    public void refund() {
        throw new UnsupportedOperationException("Refund Not supported with Crypto");
    }
    
}
