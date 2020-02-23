package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int halfIndex = word.length() / 2;

        if (word.length() % 2 == 1 && word.length() >= 5) {// this is for odd number
            System.out.println(word.substring(halfIndex - 1, halfIndex + 2));
            // just an example for even numbers:
        }else if (word.length() % 2 == 0 && word.length() >= 4) {// this is for even numbers
            System.out.println(word.substring(halfIndex - 1, halfIndex + 1));
        } else {
            System.out.println("invalid");
        }

    }
}
    /*Instructions from your teacher:
        You have a word, do the following:

        If the word has odd number of characters
        and has 5 or more characters, print the middle three
        characters of the word.

        Otherwise print "invalid".

        fifteen ==> fte
        apple ==> ppl
        hey ==> invalid
        java ==> invalid
        whatsup ==> ats
        $ ==> invalid*/