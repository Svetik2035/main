package office_hour;

public class Practice_11_18 {
    public static void main(String[] args) {

        //System.out.println("aaa");
        /*Compound operator| shorthand operator
        += , -= ,*= , /= , %=

        Increment and decrement operator
        ++, --

        Relationship (Comparision) Operator
        > ,>= , < , <= -->>>checking more or less
        == , != -->>> checking for equality and inequality

        Casting: converting one type into another
        Upcasting|Type widening
        converting data with smaller range data type to bigger range data type
        For example: converting int to long, int to double
        this happens implicitly (automatically)
        double price= 99 ; if this printed 99.0
        */
        double price = 99 ;            // 99-->> 99.0
        long earthToKrypton = 15000 ;// 15000 -->> 15000L

         /*Downcasting |type narrowing
         converting data with bigger range data type to smaller range data type
         for example: converting double to int  to short
         this must happen explicitly (by programmer/user) or IT WILL NOT COMPILE
         just like we cannot put large coffee in the small cup, IT WILL SPILL!
         to tell compiler this is what we want to do even though potential data loss occurs
         For example: int priceAsWholeNumber= 99.45; Error!!!
         int priceAsWholeNumber= (int) 99.45;//99 ,0.45 IS LOST!!!
                  */
        int myMediumCup = (int)100L ;


         /*Special Case of Char into int
         each character is represented by numbers in ASCII table (google this table)
         */
        char myLetter ='A' ;
        System.out.println( myLetter);
        /*int only store number
        so here it turns the character into  ASCII table number representation of the letter*/

         int myLetter2 ='A' ;
        System.out.println( myLetter2);

        int myLetter3 ='a' ;
        System.out.println( myLetter3);

        char myLetter4 =1315;
        System.out.println( myLetter4);

        //char myLetter5 ='87 - will not work, because it can have only 1 character in single quote

        char myLetter5 ='8';
        //--------------------
        //Positive or negative number in Programming
        //Positive:
        /* arithmetic addition operator 5+10=15;
         concatenation  "Jon" + "Snow" ="Jon Snow"
         It also indicates a number is positive int i = +5 ; It is optional
         increment operator ++x , x++ increase a number by 1;

         Arithmetic subtraction operator15-10=5 ;
         Shorthand Operator int x =10 ;
         decrement operator --x or x--
         It can  be also used to indicate a number is negative number :
         For example int bankBalance = -190 ; NOT Optional
                */

         int num = 10 ;
        System.out.println( num == 10);
        System.out.println( num!= 10);

        /*we can store the result of relational operation into boolean variable
        because all of them will return true or false
         */
        boolean isNumEqual10 = ( num == 10);













    }
}
