package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_70 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words:");
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE

        if(word1.length()> word2.length()){
            System.out.println(word1);
            }else {
            System.out.println(word2);
        }
        }

       //Instructions from your teacher:
    //Write a program that will print out the longest word.
    }






