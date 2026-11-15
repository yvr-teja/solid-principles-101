package com.solidprinciples.dip.correct;

public class MongoDBDatabase implements Database{
    @Override 
    public void save(String data){
        System.out.println("Storing document in Mongo: " + data);
    }
}
