package IO;

import java.io.*;
import java.util.Scanner;

public class TestPrintStream2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//正确路径！！！
        String s = in.next();
        if (s != null) {
            list(s, System.out);
        }
    }

    public static void list(String s, PrintStream ps) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(s));
            String ss = null;
            try {
                while ((ss = bf.readLine()) != null){
                    ps.print(ss);
                }
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
