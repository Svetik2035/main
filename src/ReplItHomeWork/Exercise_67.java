package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_67 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word = scan.next();
        int wordCount = 5;
        wordCount = word.length();
        if (wordCount < 5){
            System.out.println("Too short!");
        }else if(wordCount > 5){
            System.out.println("Too long!");

        }else if(wordCount == 5){
            String reversedWord = "";
            for (int x = 4; x >= 0; x--) {

             /*   System.out.print(x );*/

                char currentChar = word.charAt( x );
             // System.out.println( currentChar );

                reversedWord = reversedWord + currentChar ;
            }
            System.out.println(reversedWord);


        }





    }
}
