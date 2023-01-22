package com.daythree;

import java.util.ArrayList;
import java.util.Scanner;

class CartEmpty {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<Item>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Display Cart");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Item Id: ");
                int itemId = scanner.nextInt();
                System.out.print("Enter Item Name: ");
                String name = scanner.next();
                System.out.print("Enter Item Price: ");
                double price = scanner.nextDouble();
                cart.add(new Item(itemId, name, price));
                System.out.println("Item added to cart successfully!");
            } else if (choice == 2) {
                try {
                    if (cart.isEmpty()) {
                        throw new CartEmptyException("Cart is empty!");
                    } else {
                        System.out.println("Cart:");
                        for (Item item : cart) {
                            System.out.println(item);
                        }
                    }
                } catch (CartEmptyException e) {
                    System.out.println("Caught CartEmptyException: " + e);
                }
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
        scanner.close();
    }
}

