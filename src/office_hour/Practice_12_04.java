package office_hour;

import java.util.Scanner;

public class Practice_12_04 {
    public static void main(String[] args) {

        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1- st word with single corrector to start with");
        String first = scan.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Enter 1- st word with single corrector to end with");
        String second = scan.next();
        char secondAsChar = second.charAt(0);
        // user enters an A for first part
        //user enters C for second part
        //expected result should be ABC

        /*What if wwe do not want to include user's starting and ending point?
        * for (char iChar =firstAsChar (char); iChar<= (secondAsChar+ 1); iChar++){
            System.out.print(iChar+ " ");
        * */


        for (char iChar =firstAsChar; iChar<= secondAsChar; iChar++){
            System.out.print(iChar+ " ");
        }
        // user enters an D for first part
        //user enters A for second part
        //expected result should be DCBA



    }

}
