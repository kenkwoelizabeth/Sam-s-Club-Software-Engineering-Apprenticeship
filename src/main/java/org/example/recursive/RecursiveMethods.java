package org.example.recursive;

public class RecursiveMethods {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial of " + n + " is " + factorial(n));
        System.out.println("Sum of numbers from 1 to " + n + " is " + sum(n));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements is " + sumArray(arr, arr.length - 1));

        int[] fibArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        int x = 10;
        int y = 5;
        System.out.println("\nGCD of " + x + " and " + y + " is " + gcd(x, y));
    }

    // Recursive factorial calculation
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Recursive sum of numbers from 1 to n
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // Recursive sum of array elements
    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + sumArray(arr, index - 1);
    }

    // Recursive Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive greatest common divisor (GCD) calculation
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}