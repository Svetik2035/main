package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_146 {


    static class Main {


        public static void main(String[] args) {

            plus();
        }

        public static void plus() {

            //your code here
            Scanner scan = new Scanner(System.in);

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int result = num1 + num2;
            System.out.println("result: " + result);
        }

    }}
