package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUR CODE HERE
      /*  if(x>=5){
            System.out.println(x);
        }else if (x<5){
            System.out.println(-x);
        }*/
        int max = ( x>=5 ) ?  x : -x;
        System.out.println(x);

    }
}
