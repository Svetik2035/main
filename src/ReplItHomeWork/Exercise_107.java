package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_107 {
    /*Instructions from your teacher:


In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators
    * */
    public static void main(String[] args) {

/* first method
    int num, digit1, digit2, digit3, digit4, digit5;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your number:");
    num = scan.nextInt();
    String  num1 = num+"";
        for (int i = 0; i <num1.length() ; i++) {
            System.out.println(num1.charAt(i));

        }*/

    int num, digit1, digit2, digit3, digit4, digit5;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your number:");
    num = scan.nextInt();
        digit1 = num/10000;
        digit2 = (num/1000) %10;
        digit3 = (num/100)  %10;
        digit4 = (num/10)   %10;
        digit5 = num %10;

        System.out.println(digit1);//1
        System.out.println(digit2);//2
        System.out.println(digit3);//3
        System.out.println(digit4);//4
        System.out.println(digit5);//5


    }
}
