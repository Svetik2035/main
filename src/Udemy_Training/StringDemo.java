package Udemy_Training;

public class StringDemo{
    public static void main(String[] args) {
        // index      01234
        String str = " Hello";
        System.out.println(str.length());//Prints : 5
        System.out.println(str.indexOf("H"));//Prints : 0
        System.out.println("Character at = " + str.charAt(4));//Prints : Character at = o (letter o)
        System.out.println(str.toUpperCase());//Prints : HELLO
        // even after this conversion in console, the value of the string stays the same in memory
        // that we initialize in the beginning
        System.out.println(str);//Prints : Hello
        System.out.println(str.toLowerCase());//Prints : hello
        System.out.println(str.compareTo(" Hello"));//prints : 0
        System.out.println(str.compareTo(" hello"));// prints : -32
        //unicode from ASCII table of "H" =72 and "h"=104; 72-104=-32; look at the answer above
        System.out.println(str.compareTo(" ALL"));// Print: 7
        System.out.println(str.trim());



    }
}