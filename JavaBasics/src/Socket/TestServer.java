package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);

            while (true){
               Socket s =  ss.accept();
                InputStream is = s.getInputStream();
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("hi i am server from:" + s.getInetAddress() + "---port:" +s.getPort());

                Scanner in = new Scanner(System.in);
                while (true) {
                    String si = in.next();
                    dos.writeUTF(si);


                    InputStream iss = s.getInputStream();
                    DataInputStream diss = new DataInputStream(is);
                    System.out.println(diss.readUTF());
                }



            }
        } catch (IOException e) {
            System.out.println("未链接到客户端");
            e.printStackTrace();
        }
    }
}
