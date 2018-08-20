package Array;

public class Test2 {
    public static void main(String[] args) {



        int s[][] = {{1},{1,2},{1,2,3}};

        int sbk[][] =new int[3][];

        System.arraycopy(s,0,sbk,0,s.length);

        System.out.println(s[2][1]);

        System.out.println(sbk[2][1]);

        s[2][1] = 555;

        System.out.println(s[2][1]);
        System.out.println(sbk[2][1]);//二维用的是统一内存





//        String s[] = {"a","b","c"};
//        String sbk[] = new String[6];
//
//        System.arraycopy(s,0,sbk,0,s.length);
//
//        for (int i = 0; i < sbk.length; i++){
//            System.out.println(sbk[i]);
//        }
//
//        sbk[1] = "23";
//        System.out.println(s[1]);  一维是新的内存




//        int a[][] = new int [3][];
//        a[0] = new int[1];
//        a[1] = new int [2];
//        a[2] = new int [3];
//
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[i].length; j++){
//                System.out.println(i+ "  "+j);
////            }
//        }
    }
}
