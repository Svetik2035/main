package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_108 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for ( i = 1; i <= n; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }


        /**
         * Instructions from your teacher:
         * Assume that the int variables i and j have been declared, and that n has been declared and initialized.
         * Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
         *
         * Example:
         * input: 5
         * output: *
         * output: **
         * output: ***
         * output: ****
         * output: *****
         *
         * Example:
         * input: 3
         * output: *
         * output: **
         * output: ***
         */



       /*for(int i = 1 ; i<= 5; i++) {//int i = 1; -->> stars from 1; i<= 50-->> it will be done 50 times;
            // i++- add one every time
            star = star + "* ";//star+= "* ";
            //System.out.println(star);-->> just to get the star
            System.out.println(i + " " + star);
            // initialization: RUN ONCE
            //condition checking:EACH AND EVERY TIME
            //increment/decrement: after each Iteration (one time run of the loop)*/


        }



    }

