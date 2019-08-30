package linearbinarysearch;

import java.util.Scanner;

/**
 * @author George Dagis
 * @version 1.0
 * @since 2016-05-10
 */

/*
 *  Take user input and search an array filled with numbers 1-100.
 *  Compare the number of steps to find an integer through both linear and binary search methods
 */

public class LinearBinarySearch {

	//creates array
	private static int[] data = new int[100];
	
	public LinearBinarySearch(int size){
		
		// fills array with numbers 1-100
		for (int i = 1; i < 100; i++)
			data[i] = i;
	}

	public int search(int searchKey){
		
		for (int index = 0; index < data.length; index++)
			if (data[index] == searchKey)
				return index;
		
		return -1;
	}	
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		LinearBinarySearch searchArray = new LinearBinarySearch(10000);
	
		//user enters number to find
		System.out.print("Enter an Integer: ");
		int searchInt = input.nextInt();
				
		//searches array for number
		//start linear search
		int index = searchArray.search(searchInt);
		
		if (index >= 0)
			System.out.printf("Linear Search # of Steps %d%n", index);
		else
			System.out.printf("Number not present within the array.");
			
		//binary search
		int low = 0;
		int high = 99;
		int middle = (low + high +1) / 2;
		int numberOfSteps = 1;
		
		//splits array in half and compares
		do{
			if (data[middle]==searchInt)
			    {
				System.out.printf("Binary Search # of Steps: %d",numberOfSteps);
				break;
			    }
			else if (searchInt < data[middle])
				high = middle - 1;
			else if (searchInt > data[middle])
				low = middle + 1;
			middle = (low + high +1) / 2;
			
			// keep count of number of steps
			numberOfSteps++;
		   }
		   while (low <= high);
	}
}