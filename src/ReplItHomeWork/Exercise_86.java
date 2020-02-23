package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_86 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String guestNames = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String newGuest = input.nextLine();

        while(newGuest.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            String name = input.nextLine();
            guestNames = guestNames + ", " + name;
            System.out.println("Do you want to enter new guest name:");
            newGuest = input.nextLine();
        }

        System.out.println("Guest's list: " + guestNames);



    }
}