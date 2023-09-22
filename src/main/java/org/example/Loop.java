package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int m = 99;
        // A loop that will display a string 99 times.
        for (int i = 0; i < m; i++) {
            //        System.out.println("Software Developer"+ i);
        }
        //A loop that will display every odd number from 0 to 99
        for (int i = 0; i <= m; i++) {
            if (i % 2 == 1) {
                //          System.out.println(i);
            }
        }
        // A loop that will display every even number from 0 to 99

        for (int i = 0; i <= m; i++) {
            if (i % 2 == 0) {
                //          System.out.println(i);
            }
        }
        // The same loop as 3, but in a different way.
        for (int i = 0; i < m; i++) {
            while (i % 2 == 0) {
                //         System.out.println(i);
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
        Scanner sc = new Scanner(System.in);

        //output for a user to reply
        System.out.println("Enter First Number:");

        // Returns a line of text that is read from scanner
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        int sum = 0;
        // for loop for the problem
        for (int i = num1+1; i <num2; i++) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
    }

}
