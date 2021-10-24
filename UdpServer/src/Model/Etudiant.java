package Model;

import java.net.InetAddress;

public class Etudiant {

    String login;
    int port;
    InetAddress Ip_address;
    //empty_Constructor
    public Etudiant() {
    }
    //Constructor
    public Etudiant(String login, int port, InetAddress ip_address) {
        this.login = login;
        this.port = port;
        Ip_address = ip_address;
    }
    //Getters and Setters


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public InetAddress getIp_address() {
        return Ip_address;
    }

    public void setIp_address(InetAddress ip_address) {
        Ip_address = ip_address;
    }
}
