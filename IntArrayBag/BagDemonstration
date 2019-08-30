package intarraybag;

import java.util.Scanner;
import intarraybag.IntArrayBag;

/**
 * @author George Dagis
 * @version 1.0
 * @since 2016-08-31
 */

// Program implements IntArrayBag from Michael Main of the University of Colorado

public class BagDemonstration {
	
	private static Scanner stdin = new Scanner(System.in);
	public static void main(String [ ] args) {
		IntArrayBag ages = new IntArrayBag();
		getAges(ages);
		checkAges(ages);
		System.out.println("May your family live long and prosper.");
	}
	
	public static void getAges(IntArrayBag ages) {
		int userInput;
		System.out.println("Type the ages of your family members.");
		System.out.println("Type a negative number at the end and press return");
		userInput = stdin.nextInt();
		while (userInput >= 0) {
			ages.add(userInput);
			userInput = stdin.nextInt();
		}
	}

	public static void checkAges(IntArrayBag ages) {
		int userInput;
		System.out.print("Type those ages again. ");
		System.out.print("Press return after each age.");
		while (ages.size() > 0)	{
			System.out.print("Next age: ");
			userInput = stdin.nextInt();
			if (ages.countOccurrences(userInput)==0)
				System.out.println("No, that age does not occur!");

			else {
				System.out.println("Yes, I've got that age and will remove it.");
				ages.remove(userInput);
			}
		}
	}
}
