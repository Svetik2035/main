package day06;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        //+ - * /
        // % - this is another operator along with others
        //is is called modulus or remainder operator
        //it will give you the remainder
        System.out.println( 5/2 );

         System.out.println( 5.0/2 );

        System.out.println( 5.0/2f );

        System.out.println("--- modulus  . remainder ---");

        //5 divided by2 is 2 and remainder is 1

        System.out.println( 5 % 2);

        //2*2 +1=5

        System.out.println( 99 % 10 );
        //10*9 +9 =99

        System.out.println(100 % 10);

        //10*10 + 0 = 100

        //declare a variable called minutes data type int
        //print the result in x hour y minutes format
        //for example 135 minute, 2 hours 15 minutes

       /* it can be made without Scanner:
       int minutes = 135; //60*2+15=135
        int hourPart =135/60; -->>2
        int minutesPart = 135%60-->>15
        System.out. println("The minutes " +minutes+ " is" + hourPart + "hours and"  + minutesPart + "minutes" );
        */
        Scanner scan = new Scanner(System.in) ;
         int minutes  = scan.nextInt();
         int hourPart = minutes/ 60 ;
         int minsPart = 135%60;
        System.out.println("the minutes" + minutes +" is"+ hourPart + "hours and " + "minsPart" + " minutes");







    }
}
