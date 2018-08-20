package IO;

import java.io.*;

public class TestBuffedReaderAndWriter {
    public static void main(String[] args) {
        try {
            String s = null;
            BufferedWriter bfw = new BufferedWriter(new FileWriter("/Users/zhanghao/Desktop/JAVA视频/src/bf.java"));
            for (int i = 0; i < 100; i++){
                s = String.valueOf(Math.random());
                System.out.println(s);
                bfw.write(s);
                bfw.newLine();
            }

            bfw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader bfr = new BufferedReader(new FileReader("/Users/zhanghao/Desktop/JAVA视频/src/bf.java"));
            try {
                String s;
                while ((s=bfr.readLine()) != null){
                    System.out.print(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
