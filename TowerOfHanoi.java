package towerofhanoi;

import java.util.Scanner;

/**
 * @author George Dagis
 * @since 12-3-16
 * @version 1.0
 *
 */

// Program recursively solves TowerOfHanoi given any amount of discs.	

public class TowerOfHanoi {

/**
 * User enters number of discs with scanner
 */
	
	public static void main(String[] args) {
	       
		TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
	    System.out.print("Please enter the number of discs: ");
		Scanner sc = new Scanner(System.in);
		int discs = sc.nextInt();
		towersOfHanoi.step(discs, "A", "B", "C");
	}
	
/**
 * Program recursively solves the puzzle.
 * @param n
 * @param first
 * @param second
 * @param third
 */
	
	public void step(int n, String first, String second, String third) {
		if (n == 1) {
			System.out.println(first + " to " + third);
		}
		
		else {
			step(n - 1, first, third, second);
			System.out.println(first + " to " + third);
			step(n - 1, second, first, third);
		}
	}
}