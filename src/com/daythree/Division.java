//Write a program that accepts 2 integers a and b as input and finds the quotient of a/b. This program generates DivideByZeroException when the denominator is zero. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output. 
//?Also illustrate the use of finally block. Print the message ìInside finally blockî. 

package com.daythree;
import java.util.Scanner;

public class Division {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter first integer: ");
      int a = scanner.nextInt();

      System.out.print("Enter second integer: ");
      int b = scanner.nextInt();

      int quotient = a / b;
      System.out.println("Quotient of " + a + " / " + b + " = " + quotient);
    } catch (ArithmeticException e) {
      System.out.println("Denominator cannot be zero");
    } finally {
      System.out.println("Inside finally block");
    }
  }
}
