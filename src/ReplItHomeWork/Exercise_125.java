package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                       scan.next(), scan.next(), scan.next()};


           String shortestWord =  str[0];

            for (String currentWord : str) {

            if(currentWord.length() < shortestWord.length() ){
                shortestWord = currentWord;
            }
        }
        System.out.println( shortestWord);
            /*Instructions from your teacher:
            Write a program that will print the shortest word in the given array str.

            input: java, cable, red, vivid, remedy, grace
            output: red
            * */

    }
}
