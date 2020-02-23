package Udemy_Training;

import java.util.Scanner;

public class Video7 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in) ;
        int first, second = 50 ;
        boolean isTrue = false;
        System.out.println("Enter first num: ");
      first = scan.nextInt();
  // Ternary operator
      isTrue = first == 51? true:false;
        System.out.println("Num is 51");

    // if statement
   if(first >= second || isTrue ) {
          System.out.println("Num is 10");
          System.out.println("\n");

      }else if(first == 45){
          System.out.println("Num is equal 45");
      }else{
          System.out.println(" Num is lower than  " + second);
      }
     //switch statement
        switch (first){
            case 51:
                System.out.println("Num is equal 51");
                break;
            case 48:
                System.out.println(" Num is equal 48 ");
                break;
            case 57:
                System.out.println("Num is equal 57 ");
                break;
                default:
                    System.out.println("invalid number");


        }





    }
}
