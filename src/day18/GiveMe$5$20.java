package day18;

import java.util.Scanner;

public class GiveMe$5$20 {
    public static void main(String[] args) {
        // keep asking gor $5 or $20 until you will get them
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 or 20!!!");
      int x = scan.nextInt() ;
      //if the bill is not 5 dollar and not 20 dollars
       // negate the results of it's 5 or 20
        //!(x==5 || x=20 )
      //  while(x!= 5 && x!= 20) {
      while(!(x== 5 || x== 20) ) {

          System.out.println("NOT THE BILL I AM LOOKING FOR");
          System.out.println("GIVE ME 5 OR 20");
         x = scan.nextInt() ;// until you get what you want, it will repeat
      }
        System.out.println("THE HAPPY ENDING!! GOT THE MONEY");
    }
}
