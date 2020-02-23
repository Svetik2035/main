package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your area Code?:");
        int areaCode = scan.nextInt();

        System.out.println("What is your local Number?:");
        int localNumber = scan.nextInt();


        String phoneNumber = "Calling number " + "(" + areaCode + ")" + "-" + localNumber;
        System.out.println(phoneNumber);

    }
}