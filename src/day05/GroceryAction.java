package day05;

import java.util.Scanner;

public class GroceryAction {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("how many tomatoes you want to buy?: ");
        int tomatoCount = scan.nextInt();

        System.out.println("What the price of tomatoes?: ");
        float tomatoPrice = scan.nextFloat();

        float tomatoTotal = tomatoPrice*tomatoCount;
        System.out.println("You got " + tomatoCount+ " tomatoes, price is " + tomatoPrice+ " and total " + tomatoTotal);
        System.out.println();

        System.out.println("how many potatoes you want to buy?: ");
        int potatoCount = scan.nextInt();

        System.out.println("What the price of potatoes?: ");
        float potatoPrice = scan.nextFloat();

        float potatoTotal = potatoCount*potatoPrice;
        System.out.println("You got " + potatoCount+ " potatoes, price is " + potatoPrice+ " and total " + potatoTotal);
        System.out.println();

        System.out.println("how many bananas you want to buy?: ");
        int bananaCount = scan.nextInt();

        System.out.println("What the price of bananas?: ");
        float bananaPrice = scan.nextFloat();

        float bananaTotal = bananaPrice*bananaCount;
        System.out.println("You got " + bananaCount+ " bananas, price is " + bananaPrice+ " and total " + bananaTotal);



    }
}
