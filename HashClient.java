import java.util.Scanner;
import java.io.*;  
import java.net.*; 

class HashClient {
  public static void main(String[] args) {
    try{
      System.out.println("What's your plaintext?");
      Scanner sc = new Scanner(System.in);
      Socket s=new Socket("localhost",6666);  
      DataOutputStream dout=
        new DataOutputStream(s.getOutputStream());
      DataInputStream din=
        new DataInputStream(s.getInputStream()); 
      String plaintext = sc.nextLine();
      while (plaintext != "exit") {
        dout.writeUTF(plaintext);  
        String hashtext = din.readUTF();
        System.out.println("hashtext: "+hashtext);
        dout.flush();
      } 
      dout.close();
      s.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}