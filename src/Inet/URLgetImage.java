package Inet;
import java.net.*;
import java.applet.*;
import java.awt.*;

public class URLgetImage extends Applet {
	Button button;
	Image img;
	URL url;
	
	public void init(){
		try{
			url=new URL("http://www.w3c.com/images/w3s.gif");
			img=getImage(url);
		}catch(MalformedURLException e)
		{
			e.getStackTrace();
		}
		}
public void paint(Graphics g){
	g.drawString("下面的图面地址为:",0,20);
	g.drawString(url.toExternalForm(),0,40);
	g.drawImage(img,0,50,this);
}
}
