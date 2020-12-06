
import java.util.Scanner;
public class fcfsDisk {
	
		static Scanner console= new Scanner (System.in);
		public static void main (String args[])
		{
			 int head, numreqs;
			 int total = 0; 
			 int distance, cur_track; 		
             float avg=0;
             
			System.out.println("Enter Head:");
		     head  =console.nextInt();	
		    System.out.println("Enter No. of Requests:");
		     numreqs = console.nextInt(); 
		     int reqs[] = new int[numreqs];
		    System.out.println("Enter Requests:");
		    for(int i=0;i<numreqs;i++){
		        reqs[i]=console.nextInt();    
		    }
		    for (int i = 0; i < numreqs; i++)  
			 { 
			     cur_track = reqs[i]; 

			     distance = Math.abs(cur_track - head); 

			     total += distance; 
 
			     head = cur_track; 
  
			     avg= total/numreqs;
			 } 
	
			
			 System.out.println("Seek Sequence is"); 

			 for (int i = 0; i < numreqs; i++) 
			 { 
			     System.out.println(reqs[i]); 
             }  
             System.out.println("Total head movement: " +  
             total); 
            System.out.println("Average seek time: " +  avg); 
		}	

}