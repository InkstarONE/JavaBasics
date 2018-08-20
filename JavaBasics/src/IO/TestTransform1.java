package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransform1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/zhanghao/Desktop/JAVA视频/src/IIO.java"));
            osw.write("12324324324");
            System.out.println(osw.getEncoding());
            osw.close();

            osw = new OutputStreamWriter(new FileOutputStream("/Users/zhanghao/Desktop/JAVA视频/src/IIO.java",true),"ISO8859_1");
            osw.write("12324324324");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
