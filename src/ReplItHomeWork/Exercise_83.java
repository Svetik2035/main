package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_83 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        String firstTwoCharacters = txt.substring(0,2);
        System.out.println( firstTwoCharacters );
                /*Instructions from your teacher:
                using substring method output the first to letters of txt string
                for example:
                String txt = "foo"
                the first two letters are "fo"


                use print not println.*/

    }
}
