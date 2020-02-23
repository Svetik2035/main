package day06;
import java.util.Scanner;

public class NextLine_MixWord {
    public static void main(String[] args) {

        Scanner blabla =new Scanner(System.in) ;
        System.out.println("What is your name? ");

        String name = blabla.nextLine();
        System.out.println("What name is " + name);

        System.out.println("What is your age ? ");
         int age = blabla.nextInt();
         blabla.nextLine();// this line gives you an extra variable
         /* String age = blabla.nextLine();
         notice we are not storing into variable
         we just want below line to capture enter keyboard input
         so that it does not accidentally get captured by
         the nextLine we use to capture address
          */
        System.out.println("Your age is  " + age);

        System.out.println("What is the address");// if I entered my address right after age(39); it captured
        String address = blabla.nextLine();// address appeared in the correct place
         System.out.println("Your address is " + address);

         //the easiest way to fix my problem:














    }
}

