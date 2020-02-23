package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        /* Task 3:
        create an interactive program to ask user for a how many days
        and generate minutes that day has

        task 4: create an interactive program to ask user for hourly wage
         and generate yearly salary
         assume that he works 2080 hours for a year.

         task 5: grocery shopping ( use float) float potatoPrice =scan.nextFloat();-- create separate class called GroceryActions
         ask user what is the price of tomato and store it
         ask user how many tomatoes you want to buy and store it
         ask user what is the price of potato and store it
        ask user how many potatoes you want to buy and store it
        ask user what is the price of banana and store it
        ask user how many bananas you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total-->>
        You got 5 potato is 3.49 and total-->>
        You got two banana is 1.99 and total -->>
         */
        // Task 3:

        Scanner input = new Scanner(System.in);

             System.out.println( " How many days you will be resting? ");
        double minutes = input.nextDouble();

         System.out.println( " How many days you will be resting? " + minutes );

    }
}
