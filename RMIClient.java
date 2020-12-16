import java.rmi.*;

public class RMIClient{

  public static void main(String args[]){
    try{
      RMIInterface stub=(RMIInterface)Naming.lookup("rmi://localhost:5000/mul");
      System.out.println(stub.multiply(34,4));
    }catch(Exception e){
      System.out.println(e);
    }
  }

}
