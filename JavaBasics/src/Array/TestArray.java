package Array;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class TestArray {


    static void print(int a[]){
        for (int i= 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    static int binaryFind(int a[],int n){
        if (a.length <= 0){
            return -1;
        }

        int startpos = 0;
        int endpos = a.length-1;
        int mid = (a.length-1)/2;

        while (startpos <= endpos){
            if (n == a[mid]) {
                return mid;
            }
            if (n < a[mid]){
                endpos = mid+1;
            }
            if (n > a[mid]){
                startpos = mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        Scanner in = null;
        in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        print(a);
        System.out.println(binaryFind(a,5));




        //冒泡
//        int tmp,k;
//        for (int i = 0; i < a.length; i++){
//                k = i;
//            for (int j = k+1; j < a.length; j++){
//              if (a[j] < a[k]){
//                    k = j;
//              }
//            }
//
//            if (i != k){
//                tmp = a[i];
//                a[i] = a[k];
//                a[k] = tmp;
//
//            }
//        }
//
//        print(a);


//        for (int i= 0; i < args.length; i++){
//
//            System.out.println(args[i]);
//        }

//
//        if (args.length < 3 ){
//            System.out.println("error please 3 num");
//            exit(-1);
//        }
//
//
//        if (args[0].length() >= 2 || args[2].length() >= 2) {
//            try {
//                throw new Exception("正确输入数字");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }            System.out.println("please input :num1---op---num2");
//
//
//            double num1,num2;
//            num1 = Double.parseDouble(args[0]);
//            num2 = Double.parseDouble(args[2]);
//            if (args[1].equals("+")){
//                System.out.println(num1 + num2);
//
//            } else  if (args[1].equals("+")){
//                System.out.println(num1 - num2);
//
//            } else if (args[1].equals("+")){
//                System.out.println(num1 * num2);
//            } else if (args[1].equals("+")){
//                System.out.println(num1 / num2);
//            }
//        }




    }
}