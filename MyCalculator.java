/* Author: Dominic Sembiante
 * This program is designed as a calculator to compute a simple equation. 
 * Takes in two numeric inputs of the user's choice and one of four operators shown , then runs an equation on them to get the output.
 */

package myCalculator;

import java.util.*;

public class MyCalculator {
	
	
	 public static void main(String[] args) { 
	        String s1 = getInput("Enter a number: "); //Calling the getInput method to obtain first numeric value 
	        String s2 = getInput("Enter a second number: "); //Calling the getInput method to obtain second numeric value 
	        String op = getInput("Enter one of the following operations (+ - * /):"); //Calling the getInput method to obtain an operator

	        
	        double result = 0; //variable to hold the result of the equation with decimals

	      /*
	       * Try-catch block inserted for catching any exceptions outside of the required prompted values
	       * Switch statement used for calling one of four different methods to perform correct calculation depending on which operator was chosen
	      */
	       
	        try { 
	            switch (op) { 
	                case "+":
	                    result = addValues(s1, s2);
	                    break;
	                case "-":
	                    result = subtractValues(s1, s2);
	                    break;
	                case "*":
	                    result = multiplyValues(s1, s2);
	                    break;
	                case "/":
	                    result = divideValues(s1, s2);
	                    break;
	                default:
	                    System.out.println("Operation is not recognized!");
	                    return;
	            }

	            
	            System.out.println("The answer to this equation is: " + result); //Outputs answer of the equation

	            
	        } catch (Exception e) { //Catches exception outside of the required prompted values and prints out a formatting exception message
	            System.out.println("Number formatting exception " + e.getMessage());
	        }
	    }

	 /*
	  * Four methods below are used for doing the actual computing of the operation
	  * Strings are converted into doubles in order to be computed
	  */
	    private static double addValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 + d2;
	    }

	    private static double subtractValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 - d2;
	    }

	    private static double multiplyValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 * d2;
	    }

	    private static double divideValues(String s1, String s2) {
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1 / d2;
	    }

	    
	     // Method to create a prompt to give user instructions	      
	    private static String getInput(String prompt) {
	        System.out.print(prompt);
	        Scanner myScanner = new Scanner(System.in); //Create scanner to take in user input
	        return myScanner.nextLine(); //continues to next prompt
	    }
}
