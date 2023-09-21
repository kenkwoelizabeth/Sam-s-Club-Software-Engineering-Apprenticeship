package org.example;

import java.util.Scanner;

public class Day1Scan {
    public static void main(String[] args) {


        //To receive user input
        Scanner sc = new Scanner(System.in);

        //output for a user to reply
        System.out.println("What is your name:");

        // Returns a line of text that is read from scanner
        String name = sc.nextLine();
        System.out.println("My name is " + name);
    }
}