/**
 * @author George Dagis
 * @version 1.0
 * @since 2016-08-31
 */

package converttime;

/**
 * Program implements user input
 */

import java.util.Scanner;

public class ConvertTime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int hour;
		int hourStd;
		int minute;
		
/**
 * User enters the desired hour
 */
		
		System.out.println("Hello! Please enter an integer representing your hour in military time (from 0 to 23):");
		hour = input.nextInt();

/**
 * Program ensures that the value entered is valid		
 */

		if(hour < 0 || hour > 23)
			throw new IllegalArgumentException("Arguement: " +hour+ " is not between 0 and 23.");
		
/**
 * 	User enters the desired minutes
 */
			
		System.out.println("Great! Now enter an integer representing your minutes (0-60):");
		minute = input.nextInt();
		
/**
 * The time in hours is converted if it isn't a valid standard time (13-24)
 * If hours are between that range, the time is converted and the time is considered PM
 * Exception are thrown if any errors occur
 * The result is printed as well as a thank you message
 */

		if(minute < 0 && minute > 60) {
			throw new IllegalArgumentException("Arguement:" +minute+ "is not between 0 and 60.");
		}
			
		if(hour > 12) {
			hourStd = hour-12;			
		}
					
		else {
			if(hour == 0) {
				hourStd = 12;
			}
					
		else {
			hourStd = hour;}
		}
		
	System.out.printf("Thank you for using my program! Your new time in standard time is %d:%d AM", hourStd, minute);	
	
	}
}