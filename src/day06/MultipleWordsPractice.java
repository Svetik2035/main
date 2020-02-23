package day06;
import java.util.Scanner;

public class MultipleWordsPractice {
    public static void main(String[] args) {

        Scanner blabla =new Scanner(System.in) ;

        System.out.println("What is your name ?");

        String name= blabla.nextLine();

        System.out.println( "You have entered " + name);

        String cityAndState = blabla.nextLine();

        System.out.println("What city you live in , including state");

        String streetAddress =blabla.nextLine();

        System.out.println("What is your street address ?");

        String address =blabla.nextLine();

        System.out.println("Your Street address :" + streetAddress);




        System.out.println("What is your address " + address);

        //Task 4
        /* use nextLine to ask your bio
        what's your name
        which city you live in, including state,
        what is your street address
         */

    }
}
