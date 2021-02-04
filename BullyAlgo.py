import java.io.*;
import java.util.Scanner;
 
class BullyAlgo:
    def BullyAlgo():
    
        print("Enter the number of process");
        self.n = int(input());
         
        for(i in range(n)):
        
            print("For process "+(i+1)+":");
            print("Status");
            sta[i]=in.nextInt();
            System.out.println("Priority");
            pro[i] = in.nextInt();
        
         
        System.out.println("Which process will initiate election?");
        int ele = in.nextInt();
         
        elect(ele);
        System.out.println("Final coordinator is "+co);
    }
     
    static void elect(int ele)
    {
        ele = ele-1;
        co = ele+1;
        for(int i=0;i<n;i++)
        {
            if(pro[ele]<pro[i])
            {
                System.out.println("Election message is sent from "+(ele+1)+" to "+(i+1));
                if(sta[i]==1) {
                    System.out.println("OK from " + (i+1) + " to " + (ele+1));
                    elect(i+1);
                } else {
                    System.out.println("No response from " + (i+1) + " to " + (ele+1));
                }
            }
        }
    }
}