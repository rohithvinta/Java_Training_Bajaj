//Write program to demonstrate use of multiple catch clauses,
 //Use General catch clause and finally
package com.daythree;

public class MultipleCatchException {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception caught.");
        } catch (Exception e) {
            System.out.println("General exception caught.");
        } finally {
            System.out.println("This finally block will always execute.");
        }
    }
}
