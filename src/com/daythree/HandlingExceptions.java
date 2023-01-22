//Write a java program that accepts the age of the user as input. When the age of the user is less than 19,
//a custom exception named InvalidAgeException is thrown. Use exception handling mechanisms to handle this exception.
package com.daythree;

import java.io.FileNotFoundException;
import java.io.FileReader;

class HandlingExceptions {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // throws NullPointerException

            int a = 10, b = 0;
            int c = a / b; // throws ArithmeticException

            FileReader fr = new FileReader("file.txt"); // throws FileNotFoundException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e);
        }
    }
}
