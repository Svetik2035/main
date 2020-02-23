package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_174 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for(int x : nums) {
            int uniqueNumbers = 0;
            for (int value : nums) {
                if (value == x) {
                    uniqueNumbers++;
                }
            }
            if (uniqueNumbers == 1) {
                System.out.println(x);
            }

        }
    }
    }
