package com.company;

public class Leaf {
    private  int i = 100 ;
    Leaf (int i){
        this.i = i;
    }

    Leaf increament(){
        i++;
        return this;
    }

    void print(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Leaf l = new Leaf(100);
        l.increament().increament().print();
    }
}
