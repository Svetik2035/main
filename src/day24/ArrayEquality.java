package day24;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int [] scores1 = {2,5,6,7,3,34,6};
        int [] scores2 = {22,45,6,37,3,6,9};
        int [] scores3 = {2,5,6,7,3,34,6};
        int [] scores4 = {6,5,6,7,3,2,34}; //it has the same numbers as 3 but in different order

        System.out.println( scores1 == scores2);
        System.out.println( scores1 == scores3);
         //for checking an equality of two arrays object content
        //equals-->> Arrays.equals(firstArray, secondArray)
        boolean isS1S2Equals = Arrays.equals(scores1, scores2);
        System.out.println(" is score1 has the same content as score2 = " + isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1, scores3);
        System.out.println(" is score1 has the same content as score3 = " + isS1S3Equals);

        boolean isS3S4Equals = Arrays.equals(scores3, scores4);
        System.out.println(" is score3 has the same content as score4 = " + isS3S4Equals);

        System.out.println("Sorting score 3 and score 4 than compare equality " );


        isS3S4Equals = Arrays.equals(scores3, scores4);
        System.out.println(" is score3 has the same content as score4 = " + isS3S4Equals);



    }
}
