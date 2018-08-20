package com.company;

public class Student extends Person {

    int id;
    Student(int _id){
        id = _id;
    }


    void info(){
        System.out.println(id);
    }


    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student(1);
        p.info();
        s.info();
    }
}
