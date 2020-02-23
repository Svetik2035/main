package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {
        String name = "Alesya" ;
        //how would I store each and every character
        //to an char array from above name
        //without using a method that are about to learn

        char [] namesChars = new char [ name.length ()] ;
        //using for loop to fill up the array one by one

        for (int x = 0; x <namesChars.length ; x++) {
            //take an each character of a name and fill the char array values
            namesChars[x] = name.charAt(x);
        }
        System.out.println("namesChars = " + Arrays.toString(namesChars));

        char [] namesChars2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars));




    }
}
