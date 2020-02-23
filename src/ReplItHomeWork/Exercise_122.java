package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //we will use for each loop to work with values
        int count = 0;
        for( int i : nums) {// for each element in nums
            for(int j : nums) {// this int helps to compare the elements between each other to find doubles
                if (i == j) {
                    count++;// this will count if the number is single or double

                }
            }
            if (count < 2) {// it will pru=int only elements that print once, less than 2 time
                System.out.println(i);
            }
            count = 0;

        }



    }
}