package office_hour;

import java.util.Scanner;

public class OfficeHours_11_19 {
    public static void main(String[] args) {

    }

    private static void nextDouble() {



        //WRITE YOUR CODE HERE:


        double price1 = 5.5;
        double price2 = 3.5;
        double price3 = 6.3;
        double totalPrice = price1 + price2 + price3;
        /*Instructions from your teacher:
          In this assignment you will write a program to create a shopping list and prices.

          You will use Scanner object and ask user to enter 3 items followed by its
         price and you will calculate total price and show as a report.*/


        String item1, item2, item3, report;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();

        //price1 = nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();

        //price2 = nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();

        //price3 = nextDouble();

        totalPrice = price1 + price2 + price3;


        report = "Item1:" + item1 + "Price: " + price1 +
                item2 + "Price: " +
                item3 + "Price: ";
        //"Total price: 15.3"; finish it, ru, and put it into repl.it


    }


    }







