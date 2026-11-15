package com.solidprinciples.dip.bad;

public class MongoDBDatabase {
    public void storeDocument(String data){
        System.out.println("Storing document in MongoDB:"+data);
    }
}
