package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_47 {
    public static void main(String[] args) {
        /*Instructions from your teacher:
        The variable "num" holds an integer user input

        Write a conditional statement starting on line 9 that does the following:
        If num is even (divisible by 2), print "__ is even"
        If num is odd, print "__ is odd"

        Examples:
        In: 23
        23 is odd
        In: 36
        36 is even*/
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        if (num % 2 ==0) {
            System.out.println(num + " is even");
        } else if (num % 2 == 1){
            System.out.println(num + " is odd");
        }





    }
}
