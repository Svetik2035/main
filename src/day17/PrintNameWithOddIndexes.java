package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name!! ");
        String name = scan.nextLine();

        int x = 0 ;
        //x<= name.length()-1 meaning:
        //starting from 0 until last index

        //x< name.length() meaning:
        // starting from 0 until right before the count of character

        while ( x<= name.length() ){//x <= name.length()-1
          if ( x%2 ==1 ) {
              System.out.println(x);// if you want to see actual characters than run with
              //System.out.println(name.charAt(x));
          }
          ++x;
        }

    }

}
