package IndependentStudying;

import java.util.Scanner;

public class EmailSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String fN = email.charAt(0) + "";//we put empty string to make it work
        String lN = ""+ email.charAt(email.indexOf("_")+1);//we put empty string to make it work,
        // and we put +1 to print a word after "_"
        System.out.println("First name: "+ fN.toUpperCase()+ email.substring(1,email.indexOf("_")));
        System.out.println("Last name: " + lN.toUpperCase()+ email.substring(email.indexOf("_")+2, email.indexOf("@")));
        System.out.println("Domain: " + email.substring(email.indexOf("@")+1, email.indexOf(".")));
        System.out.println("Top-Level Domain: "+ email.substring(email.indexOf(".")+1, email.length()));

    }
}
