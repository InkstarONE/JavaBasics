package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        int b = 0;
        try {
            in = new FileInputStream("/Users/zhanghao/Desktop/JAVA视频/src/io.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("没找到文件");
            System.exit(-1);
        }
        try {
            out = new FileOutputStream("/Users/zhanghao/Desktop/JAVA视频/src/copyio.java");
            try {
                while ((b = in.read()) !=-1){
                    out.write((char)b);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
