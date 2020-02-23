package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_101 {
    private int countJava;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPython = 0;
        for (int i = 0; i < sentence.length() ; i++) {
            if(sentence.substring(i).startsWith("java")){
                countJava++;
            }else if(sentence.substring(i).startsWith("python")){
                countPython++;
            }

        }
        System.out.println(countJava==countPython);


    }/*
    Instructions from your teacher:
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false*/
}
