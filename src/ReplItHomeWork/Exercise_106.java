package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_106 {
    public static void main(String[] args) {
//        Instructions from your teacher:
//        Inputs:
//        String word;
//
//        Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
//        In: howdyho
//                oo
//
//        In: huehuehuehue
//                ueueueue
//
//        In: poopoo what idk what im doing
//        ooooaiaioi
//
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String map = "aeiou";
        System.out.println();
        for (int j = 0; j <word.length() ; j++) {
            for (int i=0; i <map.length() ; i++) {

                if(map.charAt(i)==word.charAt(j)){
                    System.out.print(word.charAt(j));
                }
            }

        }

    }
}