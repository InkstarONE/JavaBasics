package com.company;

public class Circle {
    private double X,Y,R;
    Circle(OPoint o,double r){
        R = r;
        X = o.getX();
        Y = o.getY();
    }

   void Contains(OPoint point){
        if (Math.abs(point.getX())<=R && Math.abs(point.getY())<=R)
            System.out.println("在内");
        else
            System.out.println("不在");
    }

    public static void main(String[] args) {
        OPoint o = new OPoint(0,0);
        OPoint p = new OPoint(0,0);

        Circle c = new Circle(o,5);
        c.Contains(p);
    }
}
