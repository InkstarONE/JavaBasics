package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TeatFileWriterAndReader {
    public static void main(String[] args) {
        FileReader fread = null;
        FileWriter fwrite = null;
        int b =0;
        try {
            fread = new FileReader("/Users/zhanghao/Desktop/JAVA视频/src/IIO.java");
            try {
                fwrite = new FileWriter("/Users/zhanghao/Desktop/JAVA视频/src/ioFileWriter.java");
                while ((b = fread.read()) != -1){
                    fwrite.write((char)b);
                    System.out.print((char)b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("没有找到文件");
            System.exit(-1);
        }
        try {
            fread.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fwrite.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
