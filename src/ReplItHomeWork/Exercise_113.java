package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i <= 9; i++) {
            nums[i] = input.nextInt();

            if ( i % 2 == 0){
                continue;

       }
            System.out.println(i);
        }

    }

}
