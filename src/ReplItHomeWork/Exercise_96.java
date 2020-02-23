package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        //code starts here
        String output = word;
        for (int i=1; i<count; i++) {
            output += separator + word;
        }
        System.out.print(output);
        /**
         * Instructions from your teacher:
         * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
         * Example:
         * input: Word
         * input: X
         * input: 3
         * output: WordXWordXWord
         *
         * Example:
         * input: This
         * input: And
         * input: 2
         * output: ThisAndThis
         *
         * Example:
         * input: This
         * input: And
         * input: 1
         * output: This
         */

    }
}
