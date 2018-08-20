package com.company;

public class Person {
    private int id;
    private int age;
    Person(){
        id = 0;
        age = 20;
    }

    Person(int id){
        this.id = id;
        age = 23;
    }

    Person(int id,int age){
        this.id = 100;
        this.age = 25;
    }

    void max(int a,int b) {
        System.out.print(a>b ? a:b);
    }

    void max(float a,float b) {
        System.out.print(a>b ? a:b);
    }

void info(){
    System.out.println(id);
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public static void main (String[] args) {
//        Person p =new Person();
//        System.out.println(p.getId()+" "+p.getAge());
//        Person p1 =new Person(1212);
//        System.out.println(p1.getId()+" "+p1.getAge());
//        Person p2 =new Person(232,232);
//        System.out.println(p2.getId()+" "+p2.getAge());
//
//        p.max(1, 2);
//        p.max(4.555f,5.666f);
//    }
}

