package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {
        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString  --->> Arrays.toString(yourArrayHere)
        // This method will give you string representation of any type of array
        // the result will look --->>   [item1 , item 2 , item 3 ...... lastItem]


        String[] superHeroes = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        //System.out.println( superHeros );
        System.out.println("Arrays.toString(superHeroes)    result :     ");
        System.out.println(Arrays.toString(superHeroes));
        // saving the string result into a variable and print
        String superHeroesAsString = Arrays.toString(superHeroes);
        System.out.println(" superHeroesAsString    result :     ");
        System.out.println(superHeroesAsString);

        // how do we get first character of superHeroesAsString variable
        System.out.println(" superHeroesAsString.charAt(0)   result :     ");
        System.out.println(superHeroesAsString.charAt(0));


        int [] numbers = {10, 44, 55, 3, 78} ;
        System.out.println("Arrays. String(numbers) RESULT");
        System.out.println(Arrays.toString (numbers));

        //create an a double array of three items called prices; and put 3 values
        //get a String representation out of this array and save it as pricesString
        //print each and every character in this String in this format
        //character at index 0 is: yourCharacterHere
        //character at index 1 is: yourCharacterHere and so on all the way till the last

        double [] prices = new double [] {15.99, 16.35, 25.21};

        System.out.println("Arrays.toString(prices) result : " + Arrays.toString(prices));

        String pricesString = Arrays.toString(prices);
        System.out.println("pricesString = " + pricesString);

        //we are looping over a String not an array so we after at last character finishes
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.print( "character at index " + " is " + pricesString.charAt(i));

            // for sorting an array in ascending order
            // sort    --->>  Arrays.sort(yourArrayHere)

            // for checking for equality of 2 array object content
            // equals  ---->> Arrays.equals(firstArray,secondArray)


        }










    }


}