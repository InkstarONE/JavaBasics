package Socket;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class TestUDPClient {
    public static void main(String[] args) throws IOException {
        Long l = 10000L;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeLong(l);
        byte buf[] = baos.toByteArray();
        DatagramPacket dp =new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",5678));
        try {
            DatagramSocket ds =new DatagramSocket(9999);
            ds.send(dp);
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }
}

