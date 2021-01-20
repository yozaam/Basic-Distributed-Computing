import java.util.Scanner;
import java.rmi.*;

public class RMIClient{

  public static void main(String args[]){
    try{
      RMIInterface stub=(RMIInterface)Naming.lookup("rmi://localhost:5000/hashtext");
      // System.out.println(stub.multiply(34,4));
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter plaintext request: ");
      String plaintext = sc.nextLine();
      System.out.print("Hashtext resoponse from RMIServer: ");
      System.out.println(stub.hash(plaintext));
    }catch(Exception e){
      System.out.println(e);
    }
  }

}
