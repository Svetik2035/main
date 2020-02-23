package day06;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
         
        System.out.println("What is the regular price");
         double regularPrice = scan.nextDouble();
        
         System.out.println("What is a discount rate");
         double discount = scan.nextDouble();                  
     
      
        double SalePrice = regularPrice - regularPrice *discount;

        System.out.println("regular price is "+regularPrice
                + "$ , discount is "  + discount + " and your got deal for 64");




    }
}
