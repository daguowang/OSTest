package Inet;
import java.io.*;
import java.net.*;
public class server {  
	   
		   
		   public static void main(String args[]) throws IOException {  
		      //Ϊ�˼���������е��쳣��Ϣ��������  
		      int port = 8899;  
		      //����һ��ServerSocket�����ڶ˿�8899��  
		      ServerSocket server = new ServerSocket(port);  
		      while (true) {  
		         //server���Խ�������Socket����������server��accept����������ʽ��  
		         Socket socket = server.accept();  
		         //ÿ���յ�һ��Socket�ͽ���һ���µ��߳���������  
		         new Thread(new Task(socket)).start();  
		      }  
		   }  
		     
		   /** 
		    * ��������Socket����� 
		    */  
		   static class Task implements Runnable {  
		   
		      private Socket socket;  
		        
		      public Task(Socket socket) {  
		         this.socket = socket;  
		      }  
		        
		      public void run() {  
		         try {  
		            handleSocket();  
		         } catch (Exception e) {  
		            e.printStackTrace();  
		         }  
		      }  
		        
		      /** 
		       * ���ͻ���Socket����ͨ�� 
		      * @throws Exception 
		       */  
		      private void handleSocket() throws Exception {  
		         BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));  
		         StringBuilder sb = new StringBuilder();  
		         String temp;  
		         int index;  
		         while ((temp=br.readLine()) != null) {  
		            System.out.println(temp);  
		            if ((index = temp.indexOf("eof")) != -1) {//����eofʱ�ͽ�������  
		             sb.append(temp.substring(0, index));  
		                break;  
		            }  
		            sb.append(temp);  
		         }  
		         System.out.println("�ͻ���: " + sb);  
		         //�����дһ��  
		       Writer writer = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");  
		         writer.write("��ã��ͻ��ˡ�");  
		         writer.write("eof\n");  
		         writer.flush();  
		         writer.close();  
		         br.close();  
		         socket.close();  
		      }  
		   }  
		}  