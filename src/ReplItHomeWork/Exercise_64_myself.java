package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_64_myself {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int charCount = word.length();
        if (charCount % 2 == 1 && charCount>=3) {
            int indexOfMiddleLetter = charCount / 2;
            System.out.println(word.charAt(indexOfMiddleLetter));
        } else if (charCount != 1 && charCount % 2 == 0 && charCount > 2) {
            int indexOfFirstHalf = charCount / 2 - 1;
            int indexOfSecondHalf = charCount / 2;
            System.out.println(word.charAt(indexOfFirstHalf) +""+ word.charAt(indexOfSecondHalf));
        }else if (charCount == 1) {
            System.out.println(word + word + word);
        } else if (charCount == 2) {
            System.out.println(word + word);
        }







    }
}