package com.solidprinciples.isp.bad;

public class QAEngineer implements Employee{

    @Override
    public void writeCode() {
        throw new UnsupportedOperationException("Writing the code is not supported by QA Engineer");
    }

    @Override
    public void testCode() {
        System.out.println("Testing Application");
    }

    @Override
    public void deployeApplication() {
        throw new UnsupportedOperationException("Deploying Application is not supported by QA Engineer");
    }
    
}
