package ReplItHomeWork;
import java.util.Scanner;

public class exercise_38 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        word1 = "java";
        word2 = "JaVa" ;

        if (word1.equals (word2)) {
             System.out.println(" word1 equals word2");
         }else{
             System.out.println( "word1 does not equal word2");
         }


    }
}
