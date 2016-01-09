package Inet;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.net.URL;  
import java.net.URLConnection;  
public class URLInAction {  
    public static void main(String[] args) throws IOException{  
        URL sina = new URL("http://www.sina.com.cn");  
        URL blog = new URL("http://write.blog.csdn.net/");  
        URL myBlog = new URL(blog, "postlist");  
  
          
        System.out.println("protocol = " + myBlog.getProtocol());  
        System.out.println("authority = " + myBlog.getAuthority());  
        System.out.println("host = " + myBlog.getHost());  
        //获取此 URL 的端口号,如果未设置端口号，则返回 -1  
        System.out.println("port = " + myBlog.getPort());  
        System.out.println("path = " + myBlog.getPath());  
        System.out.println("query = " + myBlog.getQuery());  
        System.out.println("filename = " + myBlog.getFile());  
        System.out.println("ref = " + myBlog.getRef());  
          
        //直接从URL读取数据，并输出到标准输出  
        BufferedReader in = new BufferedReader(new InputStreamReader(sina.openStream()));  
        String inputLine;  
        while ((inputLine = in.readLine()) != null)  
            System.out.println(inputLine);  
  
        in.close();  
  
    }  
      
}  