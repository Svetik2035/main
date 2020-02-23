package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        //initializing (giving a value) offerCount value to 2
        int offerCount = 2 ;
        // increasing the number by 1 using normal way
         offerCount = offerCount + 1 ;
        //or
        // this is increasing the value by  1 using compound/ shorthand operator
        offerCount += 1;

        System.out.println( "Offer Now "+ offerCount);

        //or
        //any of these three ways are correct, you can use any of them
        // Since increasing or decreasing a value is very special
        //and often used in programming
        //there even shorter shortcut for this operation
        //and we use ++ or--, This is exclusively for increasing or decreasing by 1
        //we cannot use it for any other time like increasing or decreasing value ny more than 1.

        ++ offerCount;
        System.out.println( "Offer Now after increasing by one "+ offerCount);

        -- offerCount;
        System.out.println( "Offer Now after decreasing by one "+ offerCount);


    }
}
