import java.io.*;
import java.util.*;

class TokenRing {
	public static void main(String args[]) throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of processes:");
        int n = sc.nextInt();
        int token = 0;
        System.out.println("Circular ring of processes");
        
        do{
        	System.out.println("Token at Process ID = " + token);
        	System.out.print("Press '1' if need printer, '0' if don't need: ");
        	int printer = sc.nextInt();
        	if (printer == 0) {
        		token = (token + 1 ) % n;
        		continue;
        	}
        	System.out.println("Process ID " + token + " using printer");
        	System.out.println("Process ID " + token + " finished using printer");
        	token = (token + 1 ) % n;
        }while(true);
    }
}