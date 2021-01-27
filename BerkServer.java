import java.io.*;  
import java.net.*;  

public class BerkServer {  
  public static void main(String[] args){  
    try{
      int server_time = 30;
      System.out.println("Time daemon listening at 6666");
      ServerSocket ss=new ServerSocket(6666);  
      Socket s = ss.accept();  
      DataInputStream din=
        new DataInputStream(s.getInputStream());  
      DataOutputStream dout=
        new DataOutputStream(s.getOutputStream());  
      int client_time = Integer.parseInt((String)din.readUTF());
      int delta = server_time - client_time;
      System.out.println("delta calculated");
      dout.writeUTF(Integer.toString(delta));
      dout.flush();
      dout.close();
      System.out.println("delta sent to client");
      ss.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }  
}