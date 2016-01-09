package Inet;
import java.net.*;
import java.io.*;
public class UdpSend {
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		BufferedReader bufr=
				new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if(line=="886")
				break;
			else
				
				{byte[] buf=line.getBytes();
			DatagramPacket dp=new 
					DatagramPacket(buf,buf.length,InetAddress.getByName("wangdaguo"),4003);
			ds.send(dp);
				}
		}
		
		ds.close();
	}

}
