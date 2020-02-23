package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_92 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        long  fact = 1L;
        for (int i = 1; i <= n; i++) {
            fact =fact*i;

        }
        System.out.println(fact);




    }
}
