package ReplItHomeWork;
import java.util.Scanner;
public class Exercise_79 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
        if(word.startsWith("x" )|| word.startsWith("x") || word.endsWith("X") || word.endsWith("X")){
            word = word.replace("x", "");
            word = word.replace ("X", "");
            System.out.println(word);
        }  else if(!word.startsWith("x" )|| !word.startsWith("x") || !word.endsWith("X") || !word.endsWith("X")){
            System.out.println(word);
        }
    }
}