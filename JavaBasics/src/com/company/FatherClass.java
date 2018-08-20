package com.company;

public class FatherClass {
    public int value;

    FatherClass()
    {
        this(11);
        System.out.println("Father");
    }


    FatherClass(int n){

        value = n;
        System.out.println("FFFvN");

    }

    void f(){
        value = 100;
        System.out.println(value);
    }
}
