package org.example;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        /* I own a restaurant that serves food based on a carnivore diet. I have
instructed every host at the front door to send every vegan that shows
up to the restaurant next door to the vegan version of our restaurant.
Otherwise bring the customer in and send them to the next step in the
dining experience. The instruction given to the host is a form of
conditional that controls how the restaurant operates. */
        //To receive user input

        String dietName1 = "Vegan";
        Scanner sc = new Scanner(System.in);

        //output for a user to reply
        System.out.println("Please Enter your Diet: ");
        String dietName2 = sc.nextLine();

        if (dietName2.equalsIgnoreCase(dietName1)) {
            System.out.println("Please proceed to the Vegan Section");
        } else {
            System.out.println("Please proceed to the Dining Section");
        }

    }
}
