import java.rmi.*;  

public interface RMIInterface extends Remote{  

  public int multiply(int x,int y) throws RemoteException;  

}  