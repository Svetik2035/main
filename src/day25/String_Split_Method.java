package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        String sentence = "I Love Java";
        String [] allWords = sentence.split(" ");
        System.out.println(" allWord = " + Arrays.toString(allWords));
        System.out.println("how many words do I have in this sentence? : " + allWords.length);

        // how do we get the last word of the sentence using this array I got from string
        System.out.println("Last word in this sentence is : " + allWords [allWords.length-1 ]);

        // are we limited to split by space  or we can split by anything? -Anything
        String sentence2 = "Everything is Awesome";
        //split by letter e
        String [] splitBy_e_Arr = sentence2.split( "e");
        System.out.println("Arrays.toString(splitBy_e_Arr) = " + Arrays.toString(splitBy_e_Arr));

        for (String eachPiece: splitBy_e_Arr) {// String on the left call it whatever to indicate each letter or character
            System.out.println("eachPiece =  > " + eachPiece + ">");

        }
        //split this sentence by is and print out your result

    }
}
