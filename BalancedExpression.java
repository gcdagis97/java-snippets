package balancedexpression;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author  George Dagis
 * @since 12-2-16
 * @version 1.0
 */

/*
 *  Program checks to see if an entered expression is balanced.
 *  That is, the number of '(' is equal to the number of ')'. Same is true for curly braces.
 *  All expressions entered must have () or {} in order to be considered valid.
 */


public class BalancedExpression {

    public static void main(String[] args) {
        
/**
 * Boolean established to break/continue based on balance or imbalance.
 * Stack of characters is created, which will be compared to future stack.    	
 * User is prompted and can enter their desired expression.
 */
    	boolean balanced = false;
        Stack<Character> input = new Stack<Character>();
        System.out.println("Please enter an expression to check:");
        
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        
/**
 * Char c is established.
 * Code here is heavy in boolean logic in order to check for matching sets of parenthesis, curly braces, or brackets.        
 */
        
        char[] c = new char[15];
        c = expression.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '{' || c[i] == '(' || c[i] == '[')
                input.push(c[i]);
            
            else if (c[i] == ']') {     
            	if (input.pop() == '[') 
            	{
                	balanced = true;
                    continue;
                } 
            	else 
            	{
                	balanced = false;
                    break;
                }
            } 
            else if (c[i] == ')') {
                if (input.pop() == '(')
                {
                	balanced = true;
                    continue;
                } 
                else 
                {
                	balanced = false;
                    break;
                }
            } 
            else if (c[i] == '}') {
                if (input.pop() == '{')
                {
                	balanced = true;
                    continue;
                } 
                else
                {
                	balanced = false;
                    break;
                }
            }
        }
        
        if (balanced == true)
            System.out.println("Your expression is balanced.");
        else
            System.out.println("Your expression is unbalanced.");
    }
}