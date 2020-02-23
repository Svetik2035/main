package day06;

import java.util.Scanner;

public class VariablePractice2 {
    public static void main(String[] args) {
         Scanner scan = new Scanner  (System.in);
        System.out.println("Enter your first name , last name , company separated by space : ");
        String firstName, lastName, company, email;
        firstName = scan.next();
        lastName = scan.next();
        company = scan.next() ;
         email = firstName +"_" +lastName + "@" + company + ".com";
        System.out.println("My name is "+ firstName +" " +lastName +" and I work for " + company
                + " and my email is " + email);

        // second way of doing it --with scanner

    }
}
