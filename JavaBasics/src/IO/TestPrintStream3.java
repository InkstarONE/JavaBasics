package IO;

import java.io.*;
import java.util.Date;

public class TestPrintStream3 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileWriter fw = new FileWriter("/Users/zhanghao/Desktop/JAVA视频/src/log.log");
            PrintWriter pwlog = new PrintWriter(fw);
            while ((s= bf.readLine()) != null ){
                if (s.equalsIgnoreCase("exit")) break;

                System.out.println(s.toUpperCase());

                pwlog.print(s);
                pwlog.print("----------");
                pwlog.println("     " + new Date()+"       ");
                pwlog.flush();
            }
            pwlog.flush();
            pwlog.close();fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
