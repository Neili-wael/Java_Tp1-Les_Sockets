package UdpClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class receive extends Thread {
    DatagramSocket s;
    public receive(DatagramSocket s) {
            this.s = s ;
    }
    @Override
    public void run(){
        while (true){
            DatagramPacket p = new DatagramPacket(new byte[1024],1024);
            try {
                s.receive(p);
                String Msg = new String(p.getData(),0,p.getLength());
                System.out.println(Msg);
                System.out.println(p);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
