import java.util.Scanner;
import java.io.*;  
import java.net.*; 

class HashClient {
  public static void main(String[] args) {
    try{
      Scanner sc = new Scanner(System.in);
      Socket s=new Socket("localhost",6666);  
      DataOutputStream dout=
        new DataOutputStream(s.getOutputStream());
      DataInputStream din=
        new DataInputStream(s.getInputStream()); 
      String plaintext = "";
      while (!plaintext.equals("exit")) {
        System.out.print("Enter plaintext: ");
        plaintext = sc.nextLine();
        dout.writeUTF(plaintext);
        dout.flush();  
        String hashtext = din.readUTF();
        System.out.println("hashtext: "+hashtext);
      } 
      dout.close();
      s.close();  
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}