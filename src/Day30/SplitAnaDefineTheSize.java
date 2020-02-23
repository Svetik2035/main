package Day30;

import java.util.Arrays;

public class SplitAnaDefineTheSize {
    public static void main(String[] args) {
        String sentence = "I love Java Java Java";

        //Split method has two versions:
        //1.it splitting by some separator and get whatever the count of item we get from the result

        //2. accepts internal data,
        //one is the separator another is limit of your array size
        //so if yuo have 5 words in the sentence if you split by space and put the limit for 2
        // then you will get an array with size 2 -->> {first word , the rest of the sentence}


       String[] wordsArray1 = sentence.split(" ", 1);//regex-regular expression
       String[] wordsArray2 = sentence.split(" ", 2);
       String[] wordsArray3 = sentence.split(" ", 3);
       String[] wordsArray4 = sentence.split(" ", 4);
        String[] wordsArray5 = sentence.split(" ", 7);
        System.out.println("wordsArray1 = " + Arrays.toString(wordsArray1));
        System.out.println("wordsArray2 = " + Arrays.toString(wordsArray2));
        System.out.println("wordsArray3 = " + Arrays.toString(wordsArray3));
        System.out.println("wordsArray4 = " + Arrays.toString(wordsArray4));
        System.out.println("wordsArray5 = " + Arrays.toString(wordsArray5));

        //System.out.println("wordsArray size = " + wordsArray.length);
    }
}
