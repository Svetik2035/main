package day17;

import java.util.Scanner;

public class MyFullNamePrinterInReverse_Scanner {
    public static void main(String[] args) {
        //Task
        //  assuming you don't know the length of your name
        //  write a program to print your name in reverse order
        //find out your location of your last corrector of your name
        //pick your last character of your name according to the location
        //then keep shifting the location to pick until first character
        //             01234567-->>index
        String name = "Svetlana";
        //             12345678 -->> count = name.length();
        //int lastCharacterIndex = name.length()-1;
        //get each and every character and printing them out vertically
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name !!");
         name = scan.nextLine();

        int x = name.length()-1;//( x<= name.length()-1)--REMEMBER IT
        while(x >= 0){
            System.out.println("index" + x + " : "+ name.charAt(x));//x -->>lastCharacterIndex
            --x ;
        }
    }
}
