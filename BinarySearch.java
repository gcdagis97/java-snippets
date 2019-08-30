package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author George Dagis
 * @since 9-11-2016
 * @version 1.0
 */

// Program demonstrates a binary search by having a user search for a specific integer in an array

public class BinarySearch {
	
/**
* @param main
* @param args
*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
/**
 * Array of index 13 with stored integers		
 */

		int array[] = { 2, 5, -2, 6, -3, 8, 0, -9, 4, 20, 60, 1, 3, -7};
		Arrays.sort(array);
		printArray("Sorted array", array);
 
/**
 * User enters integer here after prompted by program
 * Array searches for entered integer, and responds with an appropriate error message if neceesary
 */

		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter an integer to find: ");

		try {
			int number = input.nextInt();
			int index = Arrays.binarySearch(array, number);

			if (index > -1) {
				System.out.println("Found " + number + " at index " + index);
			}
			
			else {
				System.out.printf("Sorry, your number wasn't found.");   
			}
		}
		
		catch (InputMismatchException e) {
			System.out.printf("Sorry, but it looks like you entered something other than an integer. Please try again.");	
		}
	}

/**
* @param printArray
*/	

	private static void printArray(String message, int array[]) {

		System.out.println(message + ": [length: " + array.length + "]");

		for (int i = 0; i < 14; i++) {
			System.out.print(array[i] + " ");
		}
	}
}