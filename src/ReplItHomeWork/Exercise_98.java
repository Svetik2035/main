package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_98 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countOfHi =0;
        for (int h = 0; h <=str.length()-2; h++) {
            String current2Char = str.substring(h, h+2);
          if(current2Char.equals("hi")){
              countOfHi++;
          }
        }
            System.out.println(countOfHi);






                    /*Instructions from your teacher:
            Print out the number of times that the string "hi" appears anywhere in the given string.
            Example:
            input: abc hi how hi
            output: 2

            Example:
            input: hi code java please
            output: 1

                     */


    }
}
