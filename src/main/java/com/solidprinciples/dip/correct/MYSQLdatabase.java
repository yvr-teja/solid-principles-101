package com.solidprinciples.dip.correct;

public class MYSQLdatabase implements Database{
   @Override 
   public void save(String data){
    System.out.println("Saving data in Mysql " + data);
   }
}
