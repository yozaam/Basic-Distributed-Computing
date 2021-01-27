import java.util.Scanner;
import java.io.*;  
import java.net.*; 

class BerkClient {
  public static void main(String[] args) {
    try{
      int client_time = 10;
      System.out.println("Client time is, " + Integer.toString(client_time));
      Socket s = new Socket("localhost",6666);  
      DataOutputStream dout=
        new DataOutputStream(s.getOutputStream());
      DataInputStream din=
        new DataInputStream(s.getInputStream());  
      dout.writeUTF(Integer.toString(client_time));  
      dout.flush();
      System.out.println("time sent to server");
      int delta = Integer.parseInt((String)din.readUTF());
      System.out.println("delta recieved: "+delta);
      dout.close();
      s.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}