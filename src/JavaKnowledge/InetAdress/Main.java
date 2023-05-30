package JavaKnowledge.InetAdress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {


        InetAddress address = InetAddress.getByName("cool_light4");
        System.out.println(address);  //cool_light4/   192.168.56.1

        String name = address.getHostName();
        System.out.println(name); //主机名称

        String ip = address.getHostAddress(); //实际上就是ip地址
        System.out.println(ip);
    }


}
