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
      String plaintext =(String)dis.readUTF();  
      System.out.println("plaintext: " + plaintext);  
      String hashtext = (String)plaintext.hashCode();
      dout.writeUTF(hashtext);
      dout.flush();
      ss.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }  
}