package com.solidprinciples.isp.bad;

public class DevOpsEngineer implements Employee{

    @Override
    public void writeCode() {
        throw new UnsupportedOperationException("DevOps Engineer can not write code");
    }

    @Override
    public void testCode() {
        throw new UnsupportedOperationException("DevOps Engineer can not Testing the Application");
    }

    @Override
    public void deployeApplication() {
        System.out.println("Application Deploied Successfully");
    }
        
}
