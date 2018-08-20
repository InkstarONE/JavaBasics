package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferStream {
    public static void main(String[] args) {
        FileInputStream in = null;
        int b = 0;
        try {
            in = new FileInputStream("/Users/zhanghao/Desktop/JAVA视频/src/IIO.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("未找到");
        }
        BufferedInputStream bis = null;
        bis = new BufferedInputStream(in);

        try {
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bis.mark(99);
            for (int i = 0; i < 10 && (b = bis.read()) != -1;i++){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
