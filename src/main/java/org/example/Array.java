package org.example;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 5, -5};
        for (int number : numbers) {
            System.out.println(number);
        }
        int[] numbers1 = {3, 7, 5, -5, 9, 20};
        int size = numbers1.length;
        for (int i = 0; i < size; i++) {
            System.out.println(i);
            System.out.println(numbers.length);
        }
    }
}
