package day20;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {

        //given a string with even number character count
        //Print  2 characters in one line
        //              01234567
        //for example : Gokyuzum
        /*
        Go 01 it reminds me of a substring (0,2); it is by 2, because 2 is not included
        ky 23 (2,4)
        uz 45 (4,6)
        um 67 (6-8)
         */

        /* System.out.println( name.substring(0,2) );
        System.out.println( name.substring(2,4) );
        System.out.println( name.substring(4,6) );
        System.out.println( name.substring(6,8) );*/


      /*  System.out.println( name.substring(x, x+2));
        x= x + 2 ;
        System.out.println( name.substring(x, x+2));
        x= x + 2 ;
        System.out.println( name.substring(x, x+2));
        x= x + 2 ;
        System.out.println( name.substring(x, x+2));*/

        //my condition is x<= charCount-2
        String name = "Gokyuzum";

        int charCount = name.length();
        int lastCharIndex = charCount -1 ;

        for (int i = 0; i<= lastCharIndex-1; i+=2) {

            System.out.println( name.substring(i, i+2) );

        }



    }
}
