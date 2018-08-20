package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTransform2 {//键入回显示
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        String s = null;
        try {
            s = bfr.readLine();
            while (s != null){
                if (s.equalsIgnoreCase("exit")) break;
                System.out.println(s.toUpperCase());
                s = bfr.readLine();//2@@@@@@@
            }
            bfr.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
