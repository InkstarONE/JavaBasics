package com.company;


import java.lang.ref.SoftReference;

public class Main {
    int id;
    int age = 18;

  Main(int _id,int _age){
        id = _id;
        age = _age;
    }

    void setId(int _id){
      id = _id;
    }

    void change1(int id){
        id =1111;
    }

    void change2(Main m){
        m.setId(333);
    }
    public static  int fab(int index) {
        if (index == 1 || index == 2)
        {
            return  1;
        }

        return fab(index-1)+fab(index-2);

    }

    public static void main(String[] args) {
	// write your code here


        Main m = new Main(1,24);
        System.out.println(m.id);
        m.change1(23432);
        System.out.println(m.id);
        m.change2(m);
        System.out.println(m.id);
      //  System.out.println(fab(40));

//        int i = 1,j = 0;
//    float f1 = 0.1f;
//    float f2 = 123;
//    long l1 =12345678;
//    long l2 = 888888888888l;
//    double d1 = 2e20,d2 = 124;
//
//    byte b1 = 1,b2 = 2,b3 = 127;
//    j = j + 10;
//
//    i = i/10;
//    i = (int)(i * 0.10);
//    char c1 = 'a',c2 = 125;
//
//    byte b = (byte) (b1 - b2);
//    char c = (char)(c1 + c2 -1);
//    float f3 = f1 + f2;
//    float f4 = f1 + (float)(f2*0.1);
//    double d = d1*i+j;
//    float f = (float)(d1*5+d2);
//
//
//    int sum = 1;
//        for (i=3; i < 100; i++){
//        if (i % 2 == 1)
//            sum += i;
//    }
//        System.out.println(sum);
//
//    int Sum = 0;
//    int ff = 1;
//        for (i = 1; i< 10; i++){
//        ff = ff * i;
//        Sum += ff;
//    }
//
//        System.out.println(Sum
//
//        );

//        int i = 0;
//
//        while (i < 10){
//            System.out.println(i);
//            i++;
//        }
//
//        i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i < 10);

//        int stop = 4,skip = 4;
//        for (int j= 0; j<=5; j++){
//            if (j == skip)continue;
//
//            System.out.println(
//                    j
//            );
//        }


        //输出1～100  前5个可以被3整除的数
//        int i = 0,cnt = 0;
//        for (i = 1; i<100; i++){
//            if (i % 3 == 0){
//                System.out.println(i);
//                cnt++;
//                if (cnt == 5)break;
//            }
//        }

        //输出101至201内的质数
//        int i,k;
//        for (i = 101; i<202; i++){
//            if (i % 2 != 0){
//                for (int j = 3;j<i; j++)
//                if (i % j != 0){
//                   k =1;
//                }
//
//                System.out.println(i);
//            }
//
//        }


//        switch(2){
//            case 0:break;
//            case 2:
//                System.out.println(3333);;
//        }




}
}
