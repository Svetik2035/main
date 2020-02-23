package day10;

public class WarmUpTask1 {
    public static void main(String[] args) {
        /*Task 1
        create a class called Answer with main

        create a variable called MyAnswer as String with value of empty String

        create a variable called myNumber and assign any value

        if the number can be divided by 5 without remainder

        assign myAnswer value to FizzNumber
        If not, assign the value to a FizzNumber
       outside if else statement: for an example my number 20; it is Fizz number
       print my number is <>, it is <value of myAnswer here>
        */


        String myAnswer = "";
        int myNumber = 20 ;

        if ( myNumber % 5 ==0 ) {
            myAnswer = "Fizz Number";
        } else {
            myAnswer = "Not Fizz Number";
        }
        System.out.println("Print my number is " + myNumber + " , It is " + myAnswer);



    }
}
