package day19;

import java.util.Scanner;

public class WarmUp_SpeedAction_Scanner {
    public static void main(String[] args) {

        //assuming start speed is always < end speed
        // create a loop to stimulate slow increase of the speed,
        // for example, if start is 10 and end is 27
        //print from 10 to 27 for example
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter starting speed and ending speed ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("you have started at speed -->> ");

        for (int i = start; i <= end ; i++) {
            System.out.print( i + " ");//System.out.print( i + " ,");-->> to have comma in between numbers

        }
        //lets write pseudo code for
        // if start > end situation
        //and
        //if start < end situation

        /*1.If start speed is less than end speed
        the speed supposed to be increased
        10,11,12 ...45
        2. If Start speed is more than end speed
        the speed supposed to be decreased
        45,44,43,42....10
        3. we start with initialization: for (int i = start; i> end; i--){

         */





    }
}
