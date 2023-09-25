package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int m = 99;
        // A loop that will display a string 99 times.
        for (int i = 0; i < m; i++) {
                    System.out.println("Software Developer"+ i);
        }
        //A loop that will display every odd number from 0 to 99
        for (int i = 0; i <= m; i++) {
            if (i % 2 == 1) {
                          System.out.println(i);
            }
        }
        // A loop that will display every even number from 0 to 99

        for (int i = 0; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // The same loop as 3, but in a different way.
        for (int i = 0; i < m; i++) {
            while (i % 2 == 0) {
                        System.out.println(i);
                i++;
            }
        }
        //  A loop that will sum up the odd numbers from 0 to 99 and print it at the end.
        int sum1 = 0;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 1) {
                sum1 += i;

            }

        }
        System.out.println(sum1);

        //A loop that will sum up the even numbers from 0 to 99 and print it at the end.

        int sum2 = 0;
        for (int i = 0; i <= m; i++) {
            if (i % 2 == 0) {
                sum2 += i;

            }

        }
        System.out.println(sum2);



        //A loop that finds a sum of the numbers
        // between two numbers that are given by the user, inclusive.
        //To receive user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Initialize a variable to store the sum
        int sum = 0;

        // Ensure that num1 is smaller or equal to num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Loop to find the sum of numbers between num1 and num2 (inclusive)
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }

        // Display the result
        System.out.println("The sum of numbers between " + num1 + " and " + num2 + " (inclusive) is: " + sum);
    }
}


