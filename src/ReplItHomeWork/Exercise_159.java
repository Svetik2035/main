package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size =scan.nextInt();
        int[]nums = new int[size];
        for(int i = 0; i < size; i++){

        }
        printUniqueNumbers(nums);
    }
    public static void printUniqueNumbers(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            int match = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    match++;
                }
            }
            if(match == 1){
                System.out.println(nums[i]);
            }
        }
    }
}
