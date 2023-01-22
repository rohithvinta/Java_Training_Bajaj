//Write a java  code to swap two numbers without using temporary variable 
package com.dayone;

import java.util.Scanner;

public class Swap {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
      int num1 = input.nextInt();

    System.out.print("Enter 2nd number: ");
      int num2 = input.nextInt();

    System.out.println("Before swapping: num1 = " + num1 + " and num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

    System.out.println("After swapping: num1 = " + num1 + " and num2 = " + num2);

        input.close();
    }
}
