package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_97 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int javaCount = 0 ;
        for (int i = 0; i <word.length()-4 ; i++) {
            String currentWord = word.substring(i, i+4);
            if(currentWord.equals("java")){
                javaCount++;
            }

        }
        System.out.println(javaCount);

    }
}
