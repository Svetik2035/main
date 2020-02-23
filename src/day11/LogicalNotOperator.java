package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {

        //Logical Not operator  "!" exclamation mark used
        // It Cannot be used with any other data type other than Boolean
        // to negate the boolean value
        //first we can use it directly to boolean value like true or false
        System.out.println( true);
        System.out.println( false);
        System.out.println( "The result of ! true -->>" );
        System.out.println( ! true);// flip the coin and make it false
        System.out.println( "The result of ! false -->>");
        System.out.println( ! false);//flip the coin and make it true

        boolean isRecording =false ;
        System.out.println( "The result of ! isRecording -->>" );
        //second you can use it in front of a boolean variable
        // and it will give you an opposite value
        System.out.println( ! isRecording );

        // third you can use it in Boolean expression
        //boolean expression is any expression that result in a boolean value
        //for example 7>5 , x> 10, y==20, x<+ 100 , x>y , x > 10 && x< 100

        System.out.println("result of !(7>5) is ");
        System.out.println( ! (7>5));

        int x =7;
        System.out.println("result of (x>10) is ");
        System.out.println(  (x> 10));

        System.out.println("result of !(x>10) is ");
        System.out.println( ! (x> 10));

        //!(x> 10) -->> x<= 10

        /* create a program to check the score :ScoreChecker with main method
        create a variable called score assign a value of your choice
        if the score is less than 0 or more than 100 -->> INVALID Score!!!
        if the score is 100-->> PERFECT SCORE
        if the score is between 70 and 100 -->> YOU HAVE PASSED!
        else you have failed!!!!
        Optional: add more condition
        If score is less than 20-->> come to my office
        if th score between 30-40-->> Attend Additional Classes
         id score is between 40-70-->> Little bit more study will let you pass
         */






    }



}
