package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_82_StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String withoutLastCharacter = txt.substring(0, txt.length() - 1);


        System.out.println(withoutLastCharacter);
    }
}
