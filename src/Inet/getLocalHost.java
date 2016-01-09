package Inet;
import java.net.*;

public class getLocalHost {
     public static void main(String args[])throws UnknownHostException
     {
    	 InetAddress localHost1=InetAddress.getLocalHost();
    	 System.out.println(localHost1);
    	 InetAddress localHost2=InetAddress.getByName("wangdaguo");
    	 System.out.println(localHost2);
     }
}
