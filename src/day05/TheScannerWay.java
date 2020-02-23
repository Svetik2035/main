package day05;

import java.util.Scanner;

public class  TheScannerWay {

    public static void main(String[] args) {

        /*ask user for name
        and capture the result
        print your name is
        ask user for a birth year
        and capture the result
        print the age!!
        ask user for height
        and capture the result
        print the height

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:") ;
        String firstName = input.next() ;
        System.out.println("Nice to meet you," + firstName);
        create scanner object
         */
        // create a scanner objectScanner scan = new Scanner(System.in); //1.scanner object
        //        System.out.println("What is your name : "); //2.asked a question
        //        //String name = "Sam" ;
        //        String name = scan.next(); //3. this where we get an answer
        //        System.out.println ("My name is " + name); //4. this is printing a third line down there in the result
        //        //--My name is Svetlana
        //
               Scanner scan = new Scanner(System.in);
        //        //System.out.println("Please enter your name:") ;
        //       // String firstName = input.next() ;
        //        //System.out.println("Nice to meet you," + firstName);
        //
        //        //you can name your variable whatever you want
        //        //in below we named variable "scan"

        // scanner is data type, scan is the name  , new Scanner(system.in) is a value


        System.out.println( "What is your birth year : ");
        int birthYear =  scan.nextInt();
        int age = 2019 - birthYear;
        System.out.println( "Your age is : " + age);

        System.out.println( "What is your height? ");
        double height = scan.nextDouble();
        System.out.println("Your height is :" + height);








    }
}
