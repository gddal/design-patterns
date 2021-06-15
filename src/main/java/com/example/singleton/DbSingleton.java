package com.example.singleton;

public class DbSingleton {

    //make the variable thread safe
    private static volatile DbSingleton instance = null;

    private DbSingleton(){
        //protection against a java reflection class create an instance of this
        if(instance != null)
            throw new RuntimeException("Use getInstance() method to create");
    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized(DbSingleton.class){
                if(instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        
            return instance ;
    }
    
}
