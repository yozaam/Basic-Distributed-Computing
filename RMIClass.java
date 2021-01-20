import java.rmi.*;  
import java.rmi.server.*;  

public class RMIClass extends UnicastRemoteObject implements RMIInterface{  

  RMIClass()throws RemoteException{  
    super();  
  }  

  public int multiply(int x,int y){
    return x*y;
  }  
  
  public String hash(String plaintext) {
	String hashtext = String.valueOf(plaintext.hashCode());
	return hashtext;
  }

}  