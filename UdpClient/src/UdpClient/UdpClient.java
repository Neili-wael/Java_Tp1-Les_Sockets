package UdpClient;

import java.io.IOException;
import java.net.*;


public class UdpClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket Client = new DatagramSocket();
        InetAddress add = InetAddress.getByName("127.0.0.2");
        Send s = new Send(Client);
        receive r = new receive(Client);

        s.start();
        r.start();




    }
}
