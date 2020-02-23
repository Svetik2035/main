package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_116 {
    public static void main(String[] args) {

        /*Instructions from your teacher:
     Given an array nums, calculate the count of even numbers in nums and print out to console.
     nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
     nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
     nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0
         */

        Scanner input = new Scanner(System.in);
        int [] nums = new int[10];
        for (int i = 0; i <=9 ; i++) {
            nums [i] = input.nextInt();


            }
        int count =0;
        for(int each : nums){
            if(each % 2==0){
                count++;
            }
        }
        System.out.println(count);

    }

    }

