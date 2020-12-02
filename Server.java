import java.io.*;  
import java.net.*;  

public class Server {  
  public static void main(String[] args){  
    try{
      System.out.println("Listening at 6666");
      ServerSocket ss=new ServerSocket(6666);  
      Socket s=ss.accept();  
      DataInputStream dis=
        new DataInputStream(s.getInputStream());  
      DataOutputStream dout=
        new DataOutputStream(s.getOutputStream());  
      String name =(String)dis.readUTF();  
      System.out.println("Hello, "+name);  
      dout.writeUTF("Your name was sucessfully printed on the server!");
      dout.flush();
      ss.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }  
}