package nodelisterlist;

import java.util.InputMismatchException;

/**
 * @author George Dagis
 * @since 12-2-16
 * @version 1.0
 */

/*
 * For use with Michael Main's Lister.java and Node.java
 * Program creates a linkedlist full of names which are inputted by the user.
 */

import java.util.List;
import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args){
		
/**
 * Program accepts user input after prompting them.
 * Number of names is referred to as "length"
 */
		
        Scanner input = new Scanner(System.in);
        System.out.println("How many names will you be adding to this list?");
        int length = input.nextInt();
        
/**
 * New list created of type String
 * User inputs names until the number of names fufills the earlier established "length" value
 * Strings added to list, then printed.        
 */
        
        List<String> list = new java.util.LinkedList<String>();
        System.out.println("Enter your names one by one: ");
        for (int i = 0 ; i < length; i++) {
        	try {
        		String name = input.next();
        		list.add(name);
        	}
        	
        	catch (InputMismatchException e)
			{
		        System.out.print("InputMismatchException. Please restart the program and enter integers instead.");
			}
        }
        System.out.println("\nHere is your LinkedList: ");
        System.out.printf("%s",list);
	} 
}
