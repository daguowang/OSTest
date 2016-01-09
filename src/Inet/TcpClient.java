package Inet;

import java.net.*;
import java.io.*;

class TcpClient {
	public static void main(String args[]) throws Exception {
		Socket client = new Socket("127.0.0.1", 8087);
		OutputStream out = client.getOutputStream();
		out.write("hello server!".getBytes());
		InputStream in = client.getInputStream();
		byte[] buf = new byte[1024];
		int length = in.read(buf);
		System.out.println(new String(buf, 0, length));
		client.close();

	}

}

/*class TcpServer {
	public static void main(String args[]) throws Exception {
		ServerSocket server = new ServerSocket(8087);
		Socket client = server.accpet();
		String ip = client.getInetAddress().getHostAddress();
		System.out.println(ip + "......connected");
		InputStream in = client.getInputStream();
		byte[] buf = new byte[1024];
		int length = in.read(buf);
		System.out.println(new String(buf, 0, length));
		OutputStream out = client.getOutputStream();
		out.write("哥们收到，你也好！".getBytes());
		client.close();
		server.close();
	}
}*/