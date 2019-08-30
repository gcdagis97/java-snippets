package phonebook;

import java.util.*;

/**
 * @author George Dagis
 * @since 12-3-16
 * @version 1.0
 */

/**
 * Program simulates a PhoneBook of three people using a hashtable.
 * Program then lets user look up names
 */

public class PhoneBook {

    @SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) {
    
    	System.out.println("Here is your phonebook directory:");
    	
        Hashtable<String, Comparable> PhoneBook = new Hashtable<String, Comparable>();
        Enumeration<String> iterator;
        String tempKey;

/**
 * Names are added to PhoneBook table        
 */
        
        PhoneBook.put("George", "845-443-6388");
        PhoneBook.put("Nicole", "845-123-4567");
        PhoneBook.put("Emily", "845-891-0111");

/**
 * Traverses PhoneBook directory
 * Prints out PhoneBook contents
 */
        
        iterator = PhoneBook.keys();
        while (iterator.hasMoreElements()) {
            Object key = iterator.nextElement();
            System.out.printf("%n" + key + "............"+ PhoneBook.get(key));
        }
        
/**
 * Prompts user and asks them to search the book        
 */
        
        System.out.printf("%n%nWho would you like to search for within the phone book?%n");
        Scanner sc = new Scanner(System.in);
        tempKey = sc.nextLine();
        
/**
 * Program handles user input with appropriate message.
 */
        
        if(!PhoneBook.containsKey(tempKey)) {
            System.out.println("Sorry, can't find that person within the phone book.");
        } 
        
        else {
            String phoneNumber = (String) PhoneBook.get(tempKey);
            System.out.println("Their phone number is: "+ phoneNumber );
            PhoneBook.put(tempKey, new Long(121212));
        }
    }
}