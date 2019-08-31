package myquery;

/**
 * @author George Dagis
 * @version 1.0
 * @since 12-15-16
 */

/**
 * Program simulates a search engine *similar* to Google. (Take this with a grain of salt)
 */

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class MyQuery{

	public static void main(String[] args){
		
/**
 * Data Structure is established in order to save contents of future .txt file.
 * Scanner is established for user to search for a text file and keyword.
 * User is told where to look for .txt file/where it should be placed for this program to work.
 */
		
		Hashtable<String, ArrayList<String> > hash = new Hashtable<String, ArrayList<String> >();
		Scanner input = new Scanner(System.in);
		System.out.println("Here is where your .txt file(s) should be located for this program to work properly:");
		System.out.println(new java.io.File("").getAbsolutePath());
		System.out.println("\nEnter the filename that you want to Search values for. For example \"MyQuery.txt\"");
		BufferedReader reader = null;
		
/**
 * Program attempts to read .txt file specified by user.
 * Reader prints contents of .txt file to reader by going down each line of the .txt file.
 */
		
		try {
			reader = new BufferedReader(new FileReader(input.nextLine()));
			System.out.println("The file was found :) Here are the contents:");
			
/**
* While loop takes each line and separates each stringline into a line of strings by tokenization.
*/
			
			while(reader.ready()) {
				String currentline = reader.readLine();
				String[] result = currentline.split("\\s");
				for(int i = 0; i < result.length; i++) {
					if(!hash.containsKey(result[i])) {
						ArrayList<String> temp = new ArrayList<String>(1);
						temp.add(currentline);
						hash.put(result[i], temp);
					}
					
					else {
						ArrayList<String> temp = (ArrayList<String>)hash.get(result[i]);//
						temp.add(currentline);
					}
				}
			}
		}
		
/**
 * If the file is not found, the user is told so and the program shuts down.
 * This is used through the user of a do-while loop.
 */
		
		catch(Exception e) {
			System.out.println("Your file was not found unfortunately. Please try again.");
			System.exit(1);
		}
		
/**
 * Prints out lines of hashtable (text file).
 * Asks user if they want to try again or not by simple use of the scanner.
 * Error handling is also handled here.
 */
		
		System.out.println(hash);
		do {
			System.out.println("Enter a key to search for the value it is associated with.\n");
			System.out.println(hash.get(input.nextLine()));
			System.out.println("\nWant to try again? If so, press return and then follow the prompt. Type \"-1\" to quit");
		}
		
		while(!input.nextLine().equals("-1"));
		
		try {
			reader.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
			System.exit(1);
		}
	}
}
