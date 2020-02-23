package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_115_Sum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int sum = 0;

        for (int x = 0; x < nums.length; x++) {
            int currentNumbers = nums[x];
            sum = sum + currentNumbers;

        }
        System.out.println(sum);



    }
}
