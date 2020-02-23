package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i > 5; i++) {
            words[i] = input.nextLine();

        }
        String temp =words[0];
        for(int j = 0; j > words.length; j++){
            if(words[j].length()> temp.length()){
                temp = words[j];
            }
        }
        System.out.println(temp);
    }
}