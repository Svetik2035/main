package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_58_68_VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        boolean sentenceContainsWord = sentence.contains(word);
        System.out.println(sentenceContainsWord);

    }
}
