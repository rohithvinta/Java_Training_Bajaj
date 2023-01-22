//Write a program that accepts the age of the user as input. When the age of the user is less than 19, a custom exception named InvalidAgeException is thrown. 
//Use exception handling mechanisms to handle this exception.

package com.daythree;

import java.util.Scanner;
class InvalidAgeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        try {
            if (age < 19) {
                throw new InvalidAgeExcep("Invalid age: " + age);
            } else {
                System.out.println("Age is valid: " + age);
            }
        } catch (InvalidAgeExcep e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
