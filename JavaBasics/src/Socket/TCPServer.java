package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("hi i am server, a client come ");
        while (true){
            Socket s = ss.accept();
            InputStream i = s.getInputStream();
            DataInputStream dis = new DataInputStream(i);
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
        }
    }
}
