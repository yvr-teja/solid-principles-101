package com.solidprinciples.lsp.correct;

public interface Payment extends NonRefunablePayment {
    void refund();
}
