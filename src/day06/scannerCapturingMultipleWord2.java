package day06;
import java.util.Scanner;

public class scannerCapturingMultipleWord2 {

    public static void main(String[] args) {


        Scanner blabla =new Scanner(System.in) ;

        System.out.println("What is your name ?");
        // nexLine method of scanner is used to capture a whole message
        String name= blabla.nextLine();

        System.out.println( "You have entered " + name);
         //Task 4
        /* use nextLine to ask your bio
        what's your name
        which city you live in, including state,
        what is your street address
         */


    }

}
