package Inet;
import java.net.*;

public class URL1 {
	public static void main(String args[]) throws Exception{
		URL url=new URL("http://gceclub.sun.com.cn:80/Java_Docs/html/zh_CN/api/overview_summary.html");
		System.out.println("Э������Ϊ"+url.getProtocol());
		System.out.println("�˿�Ϊ"+url.getPort());
		System.out.println("������Ϊ"+url.getHost());
		System.out.println("�ļ���Ϊ"+url.getFile());
		System.out.println("�ļ�·��Ϊ"+url.getPath());
		System.out.println("url���ַ�����ʾ��ʽ"+url.toExternalForm());
		System.out.println("ʹ���ߵ���Ϣ"+url.getUserInfo());
		System.out.println("��ȡ��url��Ȩ����Ϣ"+url.getAuthority());
		System.out.println("��ȡ��url�Ĳ�ѯ��Ϣ"+url.getQuery());
		System.out.println("��ȡ��url���ļ��е����λ��"+url.getRef());
		
	}

}
