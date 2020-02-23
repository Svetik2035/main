package day05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {

        // create a scanner object
      Scanner scan = new Scanner(System.in);

        //asking user are your recording

        System.out.println("Are you recording? ");
        boolean isRecording = scan.nextBoolean();

        //The result of concatenation a String to any data type -->> String
        // for Boolean use only True or false for an answer
        System.out.println("Are you recording? " + isRecording);

        // google is close to how we are doing a scanner




    }
}
