package com.solidprinciples.dip.bad;

public class UserService {
    
    private MYSQLdatabase database1= 
    new MYSQLdatabase();
    private MongoDBDatabase database2=
    new MongoDBDatabase();
    public void saveUser(String user){
        database1.saveData(user);
    }

    public void saveUserInMongo(String user){
        database2.storeDocument(user);
    }
}
