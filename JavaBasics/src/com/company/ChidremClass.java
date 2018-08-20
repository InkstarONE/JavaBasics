package com.company;

public class ChidremClass extends FatherClass{
    public int value;

    ChidremClass(int n){
        super(123);
        value = n;


        System.out.println("CCV"+n);
    }

    ChidremClass(){
        this(11);
        System.out.println("ChidremClass");

    }




    @Override
    void f() {
        super.f();
        value = 200;
        System.out.println(value);
        System.out.println(super.value);

    }

    public static void main(String[] args) {
        ChidremClass cc = new ChidremClass();

    }
}
