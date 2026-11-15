package com.solidprinciples.dip.correct;

public class Main {
    public static void main(String[] args) {
        UserService u1= new UserService(new MongoDBDatabase());
        u1.saveUser("Chaplin");
        UserService u2= new UserService(new MYSQLdatabase());
        u2.saveUser("Tom");
    }
}
