package day25;

import java.util.Arrays;

public class StringToCharArrayMethod_2 {

    public static void main(String[] args) {
        String name = "Anastasiya" ;
        //pick up your own name and turn it into a char array
        //and use for each loop to loop over them
        //optionally count how many letters "a " your name

        /**
         *   three questions for Array:
         *   1.What does it do?
         *   toCharArray() is a method of the String that turns string into char array
         *   2. Do I need to provide an extra data while calling the method?
         *   -NO
         *   3.What do I get out of it?
         *   char array
         */



        char [] allCharsInName  = name.toCharArray();

        for ( char eachChar : allCharsInName )
        System.out.println("eachChar  = " + eachChar);

        // now count how many letters "a " we have
        int count = 0;
        for ( char eachChar : allCharsInName){
            if (eachChar == 'a'){
                ++count;
            }
        }
        System.out.println("count = " + count);

         //what if you want to sort all the characters of your name
        //in alphabetical order?
        Arrays.sort(allCharsInName);
        System.out.println("After Sorting allCharsInName= " + Arrays.toString(allCharsInName));


    }
}
