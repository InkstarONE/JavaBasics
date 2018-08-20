import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//public class osad {
//    public static void main(String[] args) {
//        int b = 0;
//        FileInputStream in = null;
//        try {
//           in = new FileInputStream("/Users/zhanghao/Desktop/JAVA视频/src/io.java");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("没有找到文件");
//            System.exit(-1);
//        }
//
//
//        try {
//            long num = 0;
//            while ((b = in.read()) != -1){
//                System.out.print((char)b);
//                num++;
//            }
//            System.out.println("总计"+num);
//            in.close();
//        } catch (IOException e){
//            e.printStackTrace();
//            System.out.println("error");
//        }
//
//    }
//}
