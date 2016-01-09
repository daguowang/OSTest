package Inet;
import java.net.*;
import java.io.*;

public class getInetRemoteDocument {
	public static void main(String[] args)
	{
		URL url=null;
		try{
			url=new URL("http://www.baidu.com");
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
		try{
			InputStream input=url.openStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(input));
			String info=reader.readLine();
			while(info!=null)
			{
				System.out.println(info);
				info=reader.readLine();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
