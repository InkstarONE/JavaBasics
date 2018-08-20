package String;

public class Test {
    public static void main(String[] args) {


        String sTest = "abc";
        String s = "javajjjkkkphpkkpabchpcccjavajaabcvallljvaaphpvckkkvcl,llvcllkjicv";
        int cnt = 0;
        while (s.indexOf(sTest) != -1){//不熟悉while循环的后果 傻逼
               cnt++;
               s = s.substring(s.indexOf(sTest)+sTest.length() - 1);
        }
        System.out.println(cnt);


//        String s1 = "hello";
//        String s2 = "hello";
//
//        System.out.println(s1 == s2);//指向同一片内存
//
//        String s3 = new String("hello");
//        String s4 = new String("hello");
//
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));
//
//
//        char c[] = {'h', 'l', 'l', 'o', ' ', 'w', 'o', 'l', 'd'};
//        String s5 = new String(c);
//        System.out.println(s5);
//
//        String s6 = new String(c, 4, 5);
//        System.out.println(s6);
//
//        System.out.println(s1.charAt(0)); //h
//        System.out.println(s1.length());
//
//        System.out.println(s1.indexOf("xxx"));//2
//
//        System.out.println(s1.indexOf("h", 2));
//
//        System.out.println(s1.equalsIgnoreCase("heLLo"));//忽略大小写
//
//
//        System.out.println(s1.startsWith("ll"));//判断开头
//
//        System.out.println(s1.endsWith("o"));
//
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
//
//        System.out.println(s1.substring(0, 2));
//        System.out.println(s1.substring(2));//开头到结尾
//
//        String ss = "   hahahha   ";
//        System.out.println(ss.trim());
//
//
//        String date = "1999,99,88";
//        int i = 1234567;
//        String si = String.valueOf(i);//~~~~~~多肽
//        System.out.println(si.length());
//
//        String[] sd = date.split(",");
//        for (int j = 0; j < sd.length; j++)
//            System.out.println(sd[j]);
//
//
//        String st = "javajavajhhhhhhjavakkkkjava";
//        int cnt = 0;
//        char cc [] = new char[st.length()];
//        for (int k = 0; k < st.length(); k++){
//            char t = st.charAt(k);
//            cc[k] = st.charAt(k);
//            if (t == "java" ){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//        int ccnt = 0;
//
//
//        for (int h = 0; h < cc.length; h++)
//        {
//            System.out.println();
////            if (cc[h] >= 'A' && cc[h] <= 'Z'){
////
////                ccnt++;
////            }
//            if (Character.isUpperCase(cc[h])){
//                ccnt++;
//            }
//        }
//
//        System.out.println(cnt);

    }
}
