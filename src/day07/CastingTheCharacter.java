package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);
        /* 'B' is represented by 66 in ASCII table
        here char is automatically widened to int
        and stored as a number
         */
        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        //-------------------------------------------------------------------
        //saving the number asa char
        // so we can get the character representation
        // of the number is ASCII table

        char myFirstChar = (char) 100 ;
        System.out.println( myFirstChar);

        //find out your number of each character in your first number
        //char letterS= 'S';



        char letterA ='a';
        //adding a character to an int number will result in int
        //(int) letterA + 1
        System.out.println( letterA + 1 );
        System.out.println(" "+ letterA + 1);






    }
}
