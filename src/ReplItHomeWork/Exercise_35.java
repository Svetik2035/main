package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your item: ");
        String item = scan.nextLine();
        //WRITE YOUR CODE HERE
        if (item.equalsIgnoreCase("Smartphone") ){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item.equalsIgnoreCase("Laptop") ){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item.equalsIgnoreCase("Charger") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 85$");
        }
        else if (item.equalsIgnoreCase("USB cable") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 90$");
        }
        else if (item.equalsIgnoreCase("Headphones") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 70$");
        }
        else if (item.equalsIgnoreCase("Pants") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 50$");
        }
        else if (item.equalsIgnoreCase("Hat") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 75$");
        }
        else if (item.equalsIgnoreCase("Socks") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 95$");
        }
        else if (item.equalsIgnoreCase("Blanket") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 40$");
        }
        else if (item.equalsIgnoreCase("Pillow") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 60$");
        }
        else{
            System.out.println("Invalid item!");
        }

            }
        }











       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter your item: ");
        String item = scan.nextLine();
        int giftCardBalance = 100;
        int itemPrice = scan.nextInt();
        int leftOverBalance = giftCardBalance - itemPrice;
    if (item.equals("Charger") ) {
        System.out.println("Thank you for your purchase!");
        System.out.println("Your current balance is: "  + leftOverBalance + "$");

    }else if (item.equals("Laptop") ||item.equals("Smartphone")  ){
            System.out.println("Sorry, not enough funds on your gift card!");

        }else if(item.equals("Cupcake")){
            System.out.println("Invalid item!");
        }

    }
}*/
