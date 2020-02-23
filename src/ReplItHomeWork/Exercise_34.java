package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        int itemPrice, quarters, dimes, nickels, change, x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();


        change = 100 - itemPrice;
        quarters = change / 25;
        x = (change % 25);
        dimes = x / 10;
        nickels = (x % 10) / 5;
        if (itemPrice <= 100 && itemPrice >= 25)
            if (itemPrice % 5 == 0) {
                System.out.println("Your change is " + quarters + " quarters, " + dimes
                        + " dimes, and " + nickels + " nickels.");
            } else {
                System.out.println("Invalid price!");

            } else if((itemPrice > 100)|| (itemPrice <25 ) || (itemPrice % 5!= 0)){
            System.out.println("Invalid price!");
        }

    }

}
