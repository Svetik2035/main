package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_")){
            int underScoreIndex = email.indexOf("_");
            int atSignIndex = email.indexOf("@");
            System.out.println(email.substring(underScoreIndex+1, atSignIndex)+"_"+
                    email.substring(0,underScoreIndex)+"@"+
                    (email.substring(atSignIndex+1)));
        }else if(!email.contains("_")){
            System.out.println(email);
        }
                    /*Instructions from your teacher:
            In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

            Example:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

            Example:
            input: barakobama@gmail.com
            output: barakobama@gmail.com*/

    }
}




