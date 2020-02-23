package day06;
import java. util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

        Scanner blabla =new Scanner(System.in) ;
        System.out.println("What is your name ?");//it goes to What is your name?-- in the run

        String name = blabla.next() ; //it will only capture for word (separated by space)

        //String anotherWord = blabla.next();-this is for a second word
        // make sure that you have a space between the words or numbers you entered
        // for example:Svetlana39-reading a s a one word; you have to make a space in between Svetlana ->Enter->
        //->39-> Enter

        int age = blabla.nextInt();//this is for a number

        System.out.println("You have entered " + name);
        //System.out.println("Another word is " + anotherWord);
        System.out.println("You have entered age " + age);
    }

}
