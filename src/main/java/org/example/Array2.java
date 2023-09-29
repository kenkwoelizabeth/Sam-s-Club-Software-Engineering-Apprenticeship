package org.example;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Array2 {

    /*

I always dreamed of having a restaurant with 15 options on the menu, but I don’t know what I want to put on it. I’ve decided to ask you to create the items and decide how much they’ll cost because I'm not very creative. I need 5 appetizers, 5 entrees, and 5 desserts. And then the restaurant will begin taking orders. We are only willing to take 20 orders from the drive through. Customers are only able to
order 1 item. Every time a car pulls up the drive through worker will have a script to read and the menu must appear.

After all 20 orders happen, a summary must appear with this information:
Total money made
Percentage of sales for each item.
A list of items ordered with the number of times they’re ordered.


     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays to store menu items and their prices
        String[] menuItems = {
                "Bruschetta", "Mozzarella Sticks", "Artichoke Dip",
                "Parmesan Wings", "Caprese Salad", "Grilled Salmon",
                "Filet", "Chicken Alfredo Pasta", "Vegetable Stir-Fry",
                "Classic Cheeseburger with Fries", "Cheesecake", "Chocolate Cake",
                "Tiramisu", "Fruit", "Vanilla Ice Cream"
        };

        double[] menuPrices = {
                8.99, 7.99, 9.99, 10.99, 11.99, 18.99, 24.99, 15.99, 13.99,
                14.99, 7.99, 8.99, 7.99, 6.99, 9.99
        };

        // Initialize order variables
        String[] orders = new String[20];
        double totalRevenue = 0.0;
        int orderCount = 0;

        // Read orders from customers (maximum 20 orders)

        for (int i = 1; i <= 20; i++) {
            System.out.println("Welcome to the drive-thru! Please select an item from the menu by entering its number:");
            System.out.println("---------------------------------------------------");
            displayNumberedMenu(menuItems, menuPrices);
            System.out.println("---------------------------------------------------");
            System.out.println("Enter menu number here: ");

            int choice = -1;
            boolean validInput = false;

            while (!validInput) {
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    if (choice >= 1 && choice <= menuItems.length) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid selection. Please choose a valid number from the menu.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Consume invalid input
                }
            }

            String customerOrder = menuItems[choice - 1]; // Adjust index for 0-based array
            orders[orderCount] = customerOrder;
            totalRevenue += menuPrices[choice - 1];
            System.out.println(customerOrder + " has been added to your order.");
            orderCount++;

            if (orderCount >= 20) {
                System.out.println("Drive-thru is busy. No more orders can be taken.");
                break;
            }
        }

        // Calculate the percentage of sales for each item
        int[] itemFrequency = new int[menuItems.length];
        for (int i = 0; i < menuItems.length; i++) {
            itemFrequency[i] = countItemFrequency(orders, menuItems[i]);
        }
        System.out.println("---------------------------------------------------");
        // Display order summary
        System.out.println("\nOrder Summary:");
        System.out.println("Total Money Made: $" + totalRevenue);
        System.out.println("---------------------------------------------------");
        System.out.println("Percentage of Sales:");
        for (int i = 0; i < menuItems.length; i++) {
            double percentage = (double) itemFrequency[i] / orderCount * 100;
            System.out.println(menuItems[i] + ": " + percentage + "%");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Items Ordered and Frequency:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i] + ": " + itemFrequency[i] + " times");
        }

        scanner.close();
    }

    // Display the numbered menu
    private static void displayNumberedMenu(String[] menuItems, double[] menuPrices) {
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - $" + menuPrices[i]);
        }
    }

    // Function to count the frequency of a specific item in an array
    private static int countItemFrequency(String[] array, String item) {
        int count = 0;
        for (String element : array) {
            if (item != null && item.equalsIgnoreCase(element)) {
                count++;
            }
        }
        return count;
    }
}