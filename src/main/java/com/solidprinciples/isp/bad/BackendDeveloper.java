package com.solidprinciples.isp.bad;

public class BackendDeveloper implements Employee{
    @Override 
    public void writeCode(){
        System.out.println("writing backend codes");
    }
    @Override 
    public void testCode(){
        System.out.println("writing backend codes");
    }
    @Override 
    public void deployeApplication(){
        throw new UnsupportedOperationException();
    }
}
