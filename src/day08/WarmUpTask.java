package day08;

public class WarmUpTask {
    public static void main(String[] args) {

        /*Task 1:
        Voting Eligibility Program
        * Create a variable called age  as int
        * check weather  this age is more than 18
        * if yes, print : you are ready to vote!!!
        * if it's less 18 print wait until you are 18*/


        int age = 39;
        System.out.println( age>= 18);
        if (age>= 18) { //if -where we started ; 18 - is our condition
            System.out.println("You are ready to vote!!!");
        } else { //there is where we ending
            System.out.println("wait until you are 18!");
        } //do not forget to close with the curly braces



    }
}
