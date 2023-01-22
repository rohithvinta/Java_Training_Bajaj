//Swap two numbers with using third variable
package com.dayone;

import java.util.Scanner;

public class SwapTemp {
public static void main(String[] args) {
try (Scanner input = new Scanner(System.in)) {
	System.out.println("Enter the first number: ");
	int num1 = input.nextInt();
	System.out.println("Enter the second number: ");
	int num2 = input.nextInt();
	
	    int temp = num1; 
	    num1 = num2; 
	    num2 = temp; 
	
	    System.out.println("The first number after swap is " + num1);
	    System.out.println("The second number after swap is "+ num2);
}
}
}