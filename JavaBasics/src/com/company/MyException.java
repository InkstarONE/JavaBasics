package com.company;

public class MyException extends Exception {
    public int id;
    public MyException(String message,int id){
        super(message);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
