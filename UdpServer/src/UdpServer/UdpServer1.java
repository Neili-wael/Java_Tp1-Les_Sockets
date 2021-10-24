package UdpServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer1 {
    public static void main(String[] args) throws IOException{
        DatagramSocket server = new DatagramSocket(4171);

        while (true) {
            DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
            server.receive(p);
            String str = new String(p.getData(), 0, p.getLength());
            System.out.println(str);
            DatagramPacket p1 = new DatagramPacket(str.toUpperCase().getBytes(), str.length(), p.getAddress(), p.getPort());
            server.send(p1);

        }

    }

}

