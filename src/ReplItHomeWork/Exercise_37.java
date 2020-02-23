package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_37 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numberOfCoupons = scan.nextInt();
        int candies = numberOfCoupons/10;
        int gumballs =numberOfCoupons%10/3 ;

        if(numberOfCoupons>10 ){
            System.out.println("Number of Candies: "+ candies);
            System.out.println("Number of Gumballs: "+gumballs);;
        }else if (numberOfCoupons<10 && numberOfCoupons>2) {
            System.out.println("Number of Candies: "+ candies);
            System.out.println("Number of Gumballs: "+ gumballs);
        }else if (numberOfCoupons<3) {
            System.out.println("Not enough coupons");



        }

        //The video game machines at your local arcade output coupons according to
        //how well you play the game. You can redeem 10 coupons for a candy bar or 3
        //coupons for a gumball. You prefer candy bars to gumballs. Write a program that
        //defines a variable initially assigned to the number of coupons you win. Next,
        //the program should output how many candy bars and gumballs you can get if
        //you spend all of your coupons on candy bars first, and any remaining coupons
        //on gumballs.
        //
        //if you the coupons are not enough for any redeem, display message:
        //"Not enough coupons"
        //
        //
        //Example1:
        //
        //Display prompt: "Enter number of coupons:"
        //13
        //Display prompt: "Number of Candies: 1"
        //Display prompt: "Number of Gumballs: 1"
        //
        //Example2:
        //
        //Display prompt: "Enter number of coupons:"
        //23
        //Display prompt: "Number of Candies: 2"
        //Display prompt: "Number of Gumballs: 1"
        //
        //Example3:
        //
        //Display prompt: "Enter number of coupons:"
        //2
        //Display prompt: "Not enough coupons"
    }
}
