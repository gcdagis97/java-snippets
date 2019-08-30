package dlistnode;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author George Dagis
 * @version 1.0
 * @since 2016-11-3
 */

// Tset DListNode.java by taking 6 user selected integers and removing the third node from the list.

public class DListNodeTest {

    public static void main(String[] args) {
        DListNode newList = new DListNode();
        
/**
* User is prompted and enters first integer into linked list.
* Program handles inputs other than integer inputs well with exception handling.
*/        
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your first integer: ");
        try{
        	int firstint = input.nextInt();
        	newList.addFirst(firstint);        	
        		for(int i = 0; i<5; i++) {
        			System.out.printf("Please enter the next integer: ");
        			int nextint = input.nextInt();
        			newList.addFirst(nextint);
        		}
        }
        	catch (InputMismatchException ex){
        		System.out.println("That is not a valid integer. Please restart the program and try again.\n");
        			throw new NullPointerException("NullPointerException has been thrown.");
        }
/**
* List is reversed
* The list is then printed before and after removing the third node
*/
        
        newList.reverseList();
        System.out.println("\nHere is your list: ");
        newList.displayList();
        System.out.println("\nAnd after removing the third node: ");
        newList.removeThird();
        newList.displayList();
    }
}