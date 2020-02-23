package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_66 {
    public static void main(String[] args) {

           Scanner scan = new Scanner(System.in);
           String word1 = scan.next();
           String word2 = scan.next();
        if(word1.length() != word2.length() ) {
                       System.out.println("cannot merge");
                   }else{
                       for (int i = 0; i <word1.length() ; i++) {
                           for (int j = i; j < word2.length(); j++) {
                               System.out.print(word1.charAt(i) + "" + word2.charAt(j) );
                               break;

               }
               }


           }


    }

}
