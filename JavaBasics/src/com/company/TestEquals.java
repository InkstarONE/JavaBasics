package com.company;

public class TestEquals {
    public static void main(String[] args) {
        Cat c1 = new Cat("c1", 5);
        Cat c2 = new Cat("c1", 5);

        System.out.println(c1 == c2);
        System.out.println(equals(c1,c2));

    }


    public static boolean equals(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) {
            return false;
        } else {
            if (obj1 instanceof Cat) {
                Cat c1 = (Cat) obj1;
                Cat c2 = (Cat) obj2;
                if (c1.name.equals(c2.name) && c1.size == c2.size) {
                    return true;
                }
            }
        }
        return true;
    }
}
