package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        try {
                Socket s = new Socket("127.0.0.1", 8888);
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println("hello i am client");
            System.out.println(dis.readUTF());
                System.out.println(dis.readUTF());
                while (true){
                    Socket ss = new Socket("127.0.0.1", 8888);
                    InputStream iss = s.getInputStream();
                    DataInputStream diss = new DataInputStream(is);
                    System.out.println("hello i am client2");
                    System.out.println(dis.readUTF());

                    OutputStream o = s.getOutputStream();
                    DataOutputStream dd = new DataOutputStream(o);
                    dd.writeUTF("hahahaa");

                }


        } catch (IOException e) {
            System.out.println("未链接到服务端");
            e.printStackTrace();
        }
    }
}
