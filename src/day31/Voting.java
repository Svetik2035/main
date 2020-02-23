package day31;

public class Voting {
    public static void main(String[] args) {

        checkEligibility(15);//call the method
        checkEligibility(23);
        checkEligibility(63);
      //  System.out.println(age);==>cannot access the method parameter outside of the method
        int yourAge = 12 ;
        checkEligibility( yourAge );


    }// this method has one int parameter named age
    //whoever calling this method, need to provide a number
    //it will set the value of age into that number
    //the method parameter can be only accessible within the method

    public static void checkEligibility( int age){
       // int age = 15 ;
        if (age > 18) {
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are eligible to vote");
        }

    }
}
