import java.util.Scanner;
import java.io.*;  
import java.net.*; 

class Client {
  public static void main(String[] args) {
    try{
      System.out.println("What's your plaintext?");
      Scanner sc = new Scanner(System.in);
      String plaintext = sc.nextLine();
      Socket s=new Socket("localhost",6666);  
      DataOutputStream dout=
        new DataOutputStream(s.getOutputStream());
      DataInputStream din=
        new DataInputStream(s.getInputStream());  
      dout.writeUTF(plaintext);  
      dout.flush();
      dout.close();
      String hashtext = din.readUTF();
      System.out.println("hashtext: "+hashtext);
      s.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}