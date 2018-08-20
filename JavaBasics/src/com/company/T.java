package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class T {
    int a;
    private int b;
    public int c;
    protected int d;

    public void  cc(){}

    void sd(){}

    void m(int i) throws ArithmeticException{
        if (i == 0){
          //  System.out.println("error");  不可以so

                throw new ArithmeticException("不能000");

        }
    }


    void f() throws  FileNotFoundException,IOException {
        FileInputStream in = null;
        in = new FileInputStream("tt.txt");
        int b;
        b =in.read();
        while (b != -1){
            System.out.println((char) b);
            b = in.read();

    }}

    void f2() throws IOException {
//        try {
//            f();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        f();
    }


    void register(int num) throws MyException{
            if (num < 0){
                throw new MyException("注册不呢个为负",11);
            }
            System.out.println("登记人数"+num);
        }


        void manager(){
            try {
                register(-100);
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println("错误编号为"+e.getId());
            }
        }

    public static void main(String[] args) throws MyException {

            new T().manager();

//    try {
//            FileInputStream in = null;
//        int b;
//        b = in.read();
//        while (b != -1) {
//            System.out.println((char) b);
//            b = in.read();
//
//        }
//    } catch (FileNotFoundException e){
//        System.out.println(e.getMessage());
//    }catch (Exception e){
//        e.printStackTrace();
//
//    }




//        try {
//            System.out.println(2/0);
//        }catch (ArithmeticException ae){
//            System.out.println("error");
//            ae.printStackTrace();
//        }

//        try {
//            new T().m(0);
//        }catch (ArithmeticException ae){
//            System.out.println("00000");
//            ae.printStackTrace();
//        }


//        FileInputStream in = null;
//        try {
//            in = new FileInputStream("tt.txt");
//            int b;
//            b =in.read();
//            while (b != -1){
//                System.out.println((char) b);
//                b = in.read();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch (IOException io){
//            System.out.println(io.getMessage());
//        }finally {
//            try {
//                in.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }



}
