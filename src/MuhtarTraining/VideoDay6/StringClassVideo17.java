package MuhtarTraining.VideoDay6;

import java.util.Scanner;

public class StringClassVideo17 {
    // Warm Up Task:
    /*1. declare Scanner class' object
    * 2.ask user to enter his first and  last name
    * 3.declare a string variable called full name
    * 4. concat first and last name and assign it to fullName
    * 5.Display in the console  total numbers in fullName  String
     */

    public static void main(String[] args) {
        //my way:
      String firstName , lastName;
        String fullName;
        /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        firstName = scan.next();
        lastName = scan.next();
        fullName = firstName + " " + lastName;
        System.out.println(fullName + " your name contains " +fullName.length());*/

        //Muhtar's Way:
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        firstName = scan1.nextLine();
        lastName = scan1.nextLine();
        fullName = firstName.concat( " " + lastName);
        int num = fullName.length();// reusable code
        System.out.println(fullName + " contains "+ num + " characters");
        System.out.println(fullName.charAt(fullName.length()-1));

    }
}
