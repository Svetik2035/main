package day04;
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {
        //I want to save user's input after asking some questions
        //and i want to save this input so I can do something with it

        //step 1 : use scanner class to create scanner object
        // that have this functionality

        Scanner scan = new Scanner(System.in);
        // ask user to enter a name
        System.out.println("Enter your first name please : ") ;

        //capture what user typed on a keyboard in console for a name
        //scan.next() capturing single word that user entered


        String firstName =  scan.next() ;
        //int age = scan.nextINt();



        // print the result of what we saved from user input

    }
}
