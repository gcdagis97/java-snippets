package listofrunners;

import java.util.Scanner;
import java.util.Arrays;
 
class ListOfRunners {
	
    public static void main(String[] args) {
         
        String[] runner = new String [5];
        String result;
        int[] timestarthour = new int [5];
        int[] timestartmin = new int [5];
        int[] timestartsec = new int [5];
        int[] timefinishedhour = new int [5];
        int[] timefinishedmin = new int [5];
        int[] timefinishedsec = new int [5];
        int[] durationhour = new int [5];
        int[] durationmin = new int [5];
        int[] durationsec = new int [5];

        runner = new String[5];
        		
        System.out.println("Welcome all runners!");
         
        Scanner input = new Scanner (System.in);
            
        System.out.println("How many runners would you like to store?");
        int runners = input.nextInt();
        
    	for(int i = 0; i < runners; i++) {
    		
            System.out.print("Enter Name of Runner: ");
            runner[i] = input.next();
            System.out.print("Enter Start Time (Hour): ");
            timestarthour[i] = input.nextInt();
            System.out.print("Enter Start Time (Minutes): ");
            timestartmin[i] = input.nextInt();
            System.out.print("Enter Start Time (Seconds): ");
            timestartsec[i] = input.nextInt();
            System.out.print("Enter End Time (Hours): ");
            timefinishedhour[i] = input.nextInt();
            System.out.print("Enter End Time (Minutes): ");
            timefinishedmin[i] = input.nextInt();
            System.out.print("Enter End Time (Seconds): ");
            timefinishedsec[i] = input.nextInt();
            
            durationhour[i] = timefinishedhour[i] - timestarthour[i];
            durationmin[i] = timefinishedmin[i] - timestartmin[i];
            durationsec[i] = timefinishedsec[i] - timestartsec[i];
            
            if (durationmin[i] < 0) {
            		
            	int newmin = 60 - durationmin[i];
            	durationmin[i] = newmin;
            		
        		if (durationsec[i] > 60) {
        				
        			durationhour[i]= durationhour[i] + 1;
        			//int newdurationhour = durationmin[i] - 60;
            		
            	}
            	
        		else if (durationsec[i] < 0) {
        			int newsec = 60 - durationsec[i];
        			durationsec[i] = newsec;
	
        			if (durationsec[i] > 60) {		
        				durationmin[i]= durationmin[i] + 1;
        			}
        		}
            }
        }
  
    	System.out.println("\nHere's some info\n");
        Arrays.sort( timefinishedhour );
              
        System.out.println("Runner     Start Time     End Time     Duration");
              
        for (int y = 0; y<runners; y++) {
        	result = runner[y] + "       " + timestarthour[y] + ":" + timestartmin[y] + ":" + timestartsec[y] + "       " 
            + timefinishedhour[y] + ":" + timefinishedmin[y] + ":" + timefinishedsec[y] + "       "
            + durationhour[y] + ":" + durationmin[y] + ":" + durationsec[y];
                      
            System.out.println(result);
        }	
    }
}
