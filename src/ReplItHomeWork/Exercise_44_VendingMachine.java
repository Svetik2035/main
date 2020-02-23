package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_44_VendingMachine {
    public static void main(String[] args) {
        /*Instructions from your teacher:

        Write a program that determines the change to be dispensed from a vending
        machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
        increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
        dollar bill to pay for the item.

        - int variable itemPrice
                - int variables quarters, dimes, nickels
                - Scanner object

        The program accepts itemPrice, which is a price for the item you would like to purchase.

                Positive behavior:

        Please follow the example in the image. dots mean empty space.
        -Since the item price was entered 95, change is 1 nickel

        Negative behavior:

        If itemPrice is less than 25 or more than 100 cents, then display an error message:
        Invalid price!

                If itemPrice is not divisible by 5, then also display an error message:
        Invalid price!

                use (itemPrice % 5 == 0) expression to find it is divisible by 5.

        Do not display anything else.*/

        int itemPrice, change;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int originalAmount = 100;
        itemPrice = scan.nextInt();
        change = originalAmount- itemPrice;

        //int quarters = ((originalAmount - itemPrice) / 25) % 25;
        //        //int  dimes = ((originalAmount - itemPrice- quarters) /10) % 10;
        //        //int nickels = ((originalAmount - itemPrice- quarters- dimes)/5) % 5 ;

        int quarters = ((change) / 25) % 25;
        int  dimes = ((change) /10) % 10;
        int nickels = ((change)/5) % 5 ;

        if (itemPrice % 5 == 0) {
            System.out.println("Your change is "+  quarters + " quarters, " + dimes
                    + " dimes, and " + nickels + " nickels.");
        }else if((itemPrice < 25 || itemPrice > 100) || (itemPrice % 5 != 0)) {
            System.out.println("Invalid price!");
        }

    }
}
