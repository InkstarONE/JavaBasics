package com.company;

public class Point {
    int x,y,z;

    Point(int x,int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    void setXXX(Point p){
        p.setX(4444444);
    }

    void Distance(){
        System.out.println(Math.sqrt(x*x + y*y + z*z));
    }




    public static void main(String[] args) {
        Point p =new Point(1,2,3);
        System.out.println(p.getX());
        p.setXXX(new Point(3,3,3));
        System.out.println(p.getY());
        System.out.println(p.getX());
        p.Distance();
    }
}
