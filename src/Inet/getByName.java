package Inet;

import java.net.*;

public class getByName
{
    public static void main(String[] args) throws Exception
    {
 
        InetAddress addresses[] = InetAddress.getAllByName("www.baidu.com");
        for (InetAddress address : addresses)
            System.out.println(address);
    }
}