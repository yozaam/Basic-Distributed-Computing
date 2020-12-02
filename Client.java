import java.util.Scanner;
import java.io.*;  
import java.net.*; 

class Client {
  public static void main(String[] args) {
    try{
      System.out.println("What's your name?");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      Socket s=new Socket("localhost",6666);  
      DataOutputStream dout=
        new DataOutputStream(s.getOutputStream());
      DataInputStream din=
        new DataInputStream(s.getInputStream());  
      dout.writeUTF(name);  
      dout.flush();
      dout.close();
      String response = din.readUTF();
      System.out.println("response: "+response);
      s.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}