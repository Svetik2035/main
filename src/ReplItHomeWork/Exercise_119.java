package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String[] emailSplit = email.split("@");
        String emailID = emailSplit[0];
        String emailDomain = emailSplit[emailSplit.length-1];
        int countAt = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                ++countAt;
            }
        }
        if((!email.contains("@")) || (email.contains("@") && countAt > 1) ){
            System.out.println("invalid email");
        }else{
            System.out.println("Email id: " + emailID);
            System.out.println("Email domain: " + emailDomain);
        }
    }
}




