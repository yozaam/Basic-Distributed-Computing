import java.rmi.*;
import java.rmi.registry.*;

public class RMIServer{

  public static void main(String args[]){
    try{
      RMIInterface stub=new RMIClass();
      Naming.rebind("rmi://localhost:5000/hashtext",stub);
    }catch(Exception e){
      System.out.println(e);
    }
  }
  
}