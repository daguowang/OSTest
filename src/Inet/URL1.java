package Inet;
import java.net.*;

public class URL1 {
	public static void main(String args[]) throws Exception{
		URL url=new URL("http://gceclub.sun.com.cn:80/Java_Docs/html/zh_CN/api/overview_summary.html");
		System.out.println("协议名称为"+url.getProtocol());
		System.out.println("端口为"+url.getPort());
		System.out.println("主机名为"+url.getHost());
		System.out.println("文件名为"+url.getFile());
		System.out.println("文件路径为"+url.getPath());
		System.out.println("url的字符串表示形式"+url.toExternalForm());
		System.out.println("使用者的信息"+url.getUserInfo());
		System.out.println("获取该url的权限信息"+url.getAuthority());
		System.out.println("获取该url的查询信息"+url.getQuery());
		System.out.println("获取该url在文件中的相对位置"+url.getRef());
		
	}

}
