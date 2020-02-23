package String_Methods;

import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your First Name and Last Name: ");
        String FirstName = scan.nextLine().toUpperCase();
        String LastName  = scan.nextLine().toUpperCase();
        String FullName = FirstName.concat(""+ LastName);
       //another way :
        /**
         *         String FirstName = scan.nextLine();
         *         String LastName  = scan.nextLine();
         *         String FullName = FirstName.concat(""+ LastName).toUpperCase();// using two methods at once
         */


                //String FullName = FirstName + " " + LastName;
      //  FullName = FullName.toUpperCase();// one way or look above another way to assign to each name directly
        System.out.println("Your name is: "+ FullName);


    }
}
