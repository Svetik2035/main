package day16;
import java.util.Scanner;
public class GiveMe5 {
    public static void main(String[] args) {
        // I want to ask user to enter a number
        //I will keep asking until user actually enter 5
       Scanner scan = new Scanner(System.in);
       /*  System.out.println("GIVE ME FIVE!!!");
        int userNumber = scan. nextInt();

        if (userNumber != 5) {
            System.out.println("HEY YOU DID NOT GIVE ME 5!");
        }
        System.out.println("END THE PROGRAM");*/
       int userNumber =0 ;
       while(userNumber != 5) {
           System.out.println("GIVE ME FIVE!!!");
           userNumber = scan.nextInt();
       }
        System.out.println("END THE PROGRAM");
    }
}
