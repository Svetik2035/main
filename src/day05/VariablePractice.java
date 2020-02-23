package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitives

        /*
        line1
        line2
        line3
        line4
         */
           /*thia above called block comment, everything in between will be seen as a comment

        whole numbers: byte, short, int, long (just --int-- by default if not asked specifically)
        fractional: double and float (just --double-- by default if not asked specifically)
        logical boolean(true or false)
        character: char (for single character in single code)

        is String part of primitive type? : NO!!!
        String is sequence of characters
            */
           //task 1: age calculator
        //given birth year, calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear - birthYear;

        //I was born in year 2001 , and I am 18 years old ;
        // System.out.println(" I was born in year " + 2001 + ", and I am  " + (2019-2001) + "years old");
        //18 was replaced by (20019-2001)
        System.out.println("I was born in year " + birthYear + ", and I am  " +  age  + " years old");

        //Task 2: you are speeding today
        // speed limit is some number , and you are current speed is this
        // generate this output of: You are driving 10 mph more than speed limit
        // speed limit as int , current speed as int , overThelimit as int;

        int speedLimit = 65;

        int currentSpeed = 95;

        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + currentSpeed + " mph and the speed limit was " +  speedLimit + "" + " mph,");

     // finish it









    }


}
