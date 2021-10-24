package UdpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Send extends Thread {
    DatagramSocket s;

    public Send (DatagramSocket s){
        this.s=s;
    }
    @Override
    public void run(){
        InetAddress add = null;
        try {
            add= InetAddress.getByName("127.0.0.2");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        BufferedReader Buff = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try {
                String Msg = Buff.readLine();
                DatagramPacket p = new DatagramPacket(Msg.getBytes(),Msg.length(),add,4171);
                s.send(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
