package ReplItHomeWork;


import java.util.Scanner;

public class Exercise_110 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (String eachWord : words){
            System.out.println((eachWord.charAt(0)) + ""+  eachWord.charAt( eachWord.length()-1));

        }


    }/*Instructions from your teacher:
    Given a String array words, iterate through each word
    and print first and last letter of each element in separate lines.

    Example:

    words → ["hello", "why", "by", "apple" , "note"]
    print:
    ho
    wy
    by
    ae
    ne*/

}

