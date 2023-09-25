package org.example;

import java.util.Scanner;

public class FlowControlHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Check if the difference is less than 200
        if (num2 - num1 < 200) {
            System.out.println("The difference between the numbers is less than 200. Program terminated.");
            return;
        }

        // Calculate the three sums
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        // Loop using a for loop to calculate the sum of even numbers divisible by 4
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0 && i % 4 == 0) {
                sum1 += i;
            }
        }

        // Loop using a while loop to calculate the sum of even numbers divisible by 8
        int num = num1;
        while (num <= num2) {
            if (num % 2 == 0 && num % 8 == 0) {
                sum2 += num;
            }
            num++;
        }

        // Loop using a do-while loop to calculate the sum of numbers not even and not divisible by 5
        num = num1;
        do {
            if (num % 2 != 0 && num % 5 != 0) {
                sum3 += num;
            }
            num++;
        } while (num <= num2);

        // Display the results
        System.out.println("Sum of even numbers divisible by 4: " + sum1);
        System.out.println("Sum of even numbers divisible by 8: " + sum2);
        System.out.println("Sum of numbers not even and not divisible by 5: " + sum3);
    }
}

