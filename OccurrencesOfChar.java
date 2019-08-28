import java.io.PrintStream;
import java.util.Scanner;

/** 
 * @author George Dagis
 * @since 2016-5-11
 * @version 1.0
 */

// Counts specific occurrences of a character in a user-entered string (case-sensitive)

public class OccurrencesOfChar {

/**
 * @param main	
 * @param args
 */
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
    
		// user enters sentence
		System.out.print("Enter a string: ");
		String sentence = scanner.nextLine();

		// user enters letter
		System.out.print("\nEnter a letter: ");
		char letter = scanner.next().charAt(0);
		
		//splits sentence into words
		String[] tokens = sentence.split(" ");
		String[] arrayOfString1;

		// tokenizes string
		int j = (arrayOfString1 = tokens).length;

		//calculates number of words
		System.out.println();
		System.out.printf("Number of words: %d\n", j);

		int counter = 0;
		for( int z=0; z<sentence.length(); z++ ) {
			if( sentence.charAt(z) == letter) {
				counter++;
			} 
		}

		System.out.printf("Total number of occurences of the letter %s is: %d%n ", letter, counter);
		
		// prints words (tokens) out individually
		for (int i = 0; i < j; i++)
		{	
			String token = arrayOfString1[i];
			System.out.printf(token);
			System.out.printf(" \n");
		} 
	}
}