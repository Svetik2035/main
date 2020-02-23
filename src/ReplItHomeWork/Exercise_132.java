package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        /* 7 judges
        scores from 0 to 10 i n floating value

        the highest and the lowest scores are thrown out
        remaining scores are  added together
        the sum =
         */
        for (int i = 1; i <7 ; i++) { //judge count from 1 to 7
            System.out.println("Enter score for judge " + i);//print a message + number of judge
            score[i]=input.nextFloat();// score input
        }
        System.out.println("Enter difficulty:");// print the massage
        float difficulty =input.nextFloat();//create a float to input the difficulty level
        float min=score[0]; //created a float to find the lowest score
        for (int i=0;i<7;i++){// created a for loop to find a minimum score
            if (min>score[i]){//create a condition with  if statement  to find a lowest score
                min=score[i];//the lowest score equals the minim score
            }

        }
        //System.out.println(min);
        float max=score[0]; // created a float to find the highest score
        for (int i=0;i<7;i++){// created a for loop to find a highest score
            if (max<score[i]){//create a condition with  if statement  to find a highest score
                max=score[i];//the lowest score equals the maximum score
            }
        }
        //System.out.println(max);
        float sum=0;
        for (int i=0;i<7;i++){
            sum=sum+score[i];
        }
        double total=0;
        total=(sum-(min+max))*difficulty*0.6;


        // FINAL OUTPUT
       System.out.printf("Total: %.2f", total);

                   /*Instructions from your teacher:
            In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
            The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.
            The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
            Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
            output: Enter score for judge 1:
            input: 1
            output: Enter score for judge 2:
            input: 5
            output: Enter score for judge 3:
            input: 5
            output: Enter score for judge 4:
            input: 5
            output: Enter score for judge 5:
            input: 5
            output: Enter score for judge 6:
            input: 8
            output: Enter score for judge 7:
            input: 9
            output: Enter difficulty:
            input: 2.1
            output: Total: 35.28*/

    }
}
