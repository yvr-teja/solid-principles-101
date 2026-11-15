package com.solidprinciples.isp.correct;

public class BackendDeveloper implements Coder,Tester{

    @Override
    public void writeCode() {
        System.out.println("Dev Wirting Code");
    }


    @Override
    public void testCode() {
        System.out.println("Dev Test Code ");
    }
    
}
