package selectionsort;

// File: Select.java
// A Java application to illustrate the use of a selection sort
// Additional javadoc documentation is available at:
//   http://www.cs.colorado.edu/~main/docs/Select.html
 
/******************************************************************************
* The <CODE>Select</CODE> Java application illustrates a selection sort.
*
* <p><dt><b>Java Source Code for this class:</b><dd>
*   <A HREF="../applications/Select.java">
*   http://www.cs.colorado.edu/~main/applications/Select.java
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version
*   Jun 12, 1998
******************************************************************************/

// I have added print and insertionsort methods at the bottom of this program.

public class SelectionSort {
	
	public static void main(String[ ] args) {
		final String BLANKS = "  "; // A String of two blanks
	    int i;                      // Array index
	
	    int[ ] data = { 1000, 80, 10, 50, 70, 60, 90, 20, 30, 40, 0, -1000 };
	
	    // Print the array before sorting:
	    System.out.println("Here is the entire original array:");
	    
	    for (i = 0; i < data.length; i++)
	       System.out.print(data[i] + BLANKS);
	    
	    System.out.println( );
	
	    // Sort the numbers, and print the result with two blanks after each number.
	    selectionsort(data, 1, data.length-2);
	    System.out.printf("%nI have sorted all but the first and last numbers.%n");
	    System.out.printf("%nThe numbers are now:%n");
	    for (i = 0; i < data.length; i++)
	    	System.out.print(data[i] + BLANKS);
	    System.out.println( );
	    System.out.printf("%nHere is your data when acted upon by an insertionsort method:%n%n");
	    insertionsort(data);
	}
	   
	public static void selectionsort(int[ ] data, int first, int n) {
		
		int i, j; // Loop control variables
	    int big;  // Index of largest value in data[first]...data[first+i]
	    int temp; // Used during the swapping of two array values
	    for (i = n-1; i > 0; i--) {  
	    
	    // Calculate big as the index of the largest value in data[first]...data[first+i]:
	    big = first;
	    for (j = first+1; j <= first+i; j++)
	    	if (data[big] < data[j])
	    		big = j;
	
	    // swap data[first+i] with data[big]:
	    temp = data[first+i];
	    data[first+i] = data[big];
	    data[big] = temp;
	    }
	}
  
/**
 * Added print and insertion sort methods here
 */
   
   private static void print(int[] input) {
	   for (int i = 0; i < input.length; i++) {
		   System.out.print(input[i] + ", ");
	   }
	   System.out.println("\n");
   }
   
   public static void insertionsort(int array[]) {
	   int n = array.length;
	   for (int j = 1; j < n; j++) {
		   int key = array[j];
		   int i = j-1;
		   while((i > -1) && (array [i] > key)) {
			   array [i+1] = array [i];
			   i--;
		   }
		   
		   array[i+1] = key;
		   print(array);
	   }
   }
}