package String_Methods;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        /**Task 3
         * Ask user to enter full name, assuming full name  is 2 words
         * write a program to print initials; for example,
         * jon Snow -->> JS
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();
        //find out index of the space after first name , and next index will last name 's first character
        int lastNameInitialIndex = fullName.indexOf(" ")+1;
        String initials = fullName.charAt(0) + "" + fullName.charAt(lastNameInitialIndex);
        System.out.println(initials);




    }
}
