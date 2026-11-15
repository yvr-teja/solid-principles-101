package com.solidprinciples.isp.correct;

public class DevOpsEngineer implements Deployer{

    @Override
    public void deployeApplication() {
        System.out.println("Application Deploied Successfully");
    }
        
}
