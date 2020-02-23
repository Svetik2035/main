package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_148 {

    static class Main {

        public static void cube()
        {
            //your code here
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
           int cubeOfNumber = num*num*num;
            System.out.println(cubeOfNumber);
        }//end cube

        public static void main(String[] args) {

            cube();

        }
    }
}
