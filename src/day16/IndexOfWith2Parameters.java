package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {

        //get the second java from the sentence
        //assume you already know there is 4 Java in this sentence
        //second Java means-->> the java showed up after first java
        //first, find out  where is location of the first java showed up
        // in order to find second one,
        /*instead of searching from beginning
        search from right after the location you found first Java
        then
        it will give you the index of second Java
        But HOW DO i START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        BECAUSE INDEXOF ALWAYS STARTS FROM BEGINNING
        indexof method has 2 versions 1 expect 1 external data
        another expect 2 exernal data-->> yourString.indexOf();
                 */
        //             012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";

        System.out.println("Java starting from 0:  " + name.indexOf("Java"));
        System.out.println("Java starting from 7: " + name.indexOf("Java", 7));
        System.out.println("Java starting from 8: " + name.indexOf("Java", 8));
        System.out.println("Java starting from 9: " + name.indexOf("Java", 9));
        System.out.println("Java starting from 19: " + name.indexOf("Java", 19));
        System.out.println("Java starting from 20: " + name.indexOf("Java", 20));

        // how do I start from location that I get past Java
        //basically starting point different that  0 so that it will get past a first Java
        int firstJavaLocation = name.indexOf("Java"); //location of first in this case 7
        /*starting point can be right after the index of first character of the word
       or you can start here from +4
       or you can start write after  you finish the word you are searching , for the wordJave + 4
       if we do not know the length of the word -->> + word.length();
        * */
        int startingPointToSearchSecondJava = firstJavaLocation + 1; //or you can start here +4
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava );
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        /* I do not know how many words in this sentence. I only know there are 3+ words
        i just want to know what is the second word
        the word in between first space and second space is second word
         */
        int firstSpaceLocation =name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation + 1 );
        System.out.println("Second word in this sentence is " + name.substring(firstSpaceLocation + 1, secondSpace));


    }



}
