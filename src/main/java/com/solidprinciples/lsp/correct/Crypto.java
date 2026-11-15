package com.solidprinciples.lsp.correct;

public class Crypto implements NonRefunablePayment{

    @Override
    public void pay() {
        System.out.println("Crypto Payment Done");
    }  
}
