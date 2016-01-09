package Inet;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

@SuppressWarnings("serial")
public class ServerSocket extends Applet{
	ServerSocket server;
	String message="";
	TextField t;
	DataOutputStream output;
	Socket socket;
	public ServerSocket(int parseInt) {
		// TODO Auto-generated constructor stub
	}
	public void init(){
		setSize(300,300);
		Label label1=new Label("监听端口号为:");
		add(label1);
		t=new TextField(20);
		add(t);
		Button b=new Button("开始监听端口");
		mouseListener m=new mouseListener();
		b.addMouseListener(m);
		add(b);
	}
	public void paint(Graphics g)
	{
		g.drawString(message,20,160);
	}
	class mouseListener implements MouseListener{
		public void mouseReleased(MouseEvent m){
			}
		public void mouseClicked(MouseEvent m){
			try{
				socket=server.accpet();
				message+="\r\n客户端已连接!";
				output=new DataOutputStream(socket.getOutputStream());
				output.writeUTF("已经成功连接到服务器!");
				output.close();
				server.close();
			}catch(SocketException e)
			{
				message+=e.toString();
				repaint();
				e.printStackTrace();
				System.exit(1);
			}catch(IOException e)
			{
				message+=e.toString();
				repaint();
				e.printStackTrace();
				System.exit(1);
			}
			repaint();
		}
		public void mouseEntered1(MouseEvent m){
		}
		public void mousePressed1(MouseEvent m){
		try{
			server=new ServerSocket(Integer.parseInt(t.getText()));
			message+="端口"+t.getText()+"\n\r等待客户端连接......";
			repaint();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		public void mouseExited(MouseEvent m){

		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	public Socket accpet() {
		// TODO Auto-generated method stub
		return null;
	}
	public void close() {
		// TODO Auto-generated method stub
		
	}
}
