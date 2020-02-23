package day05;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        System.out.println( "What is the temperature in F? ");

        double fahrenheit =scan.nextDouble();

        double celsius = ( 5.0/9 )* (fahrenheit-32 ) ;
       // fahrenheit 80 is 23 in celsius
        System.out.println( "fahrenheit " + celsius + " in celsius ");*/

        System.out.println("---------------------------------------");
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature in Fahrenheit? ");

        double fahrenheit =scan.nextDouble();
        double celsius = (5.0 / 9)*(fahrenheit - 32);
        System.out.println("Temperature " + fahrenheit+ " F equals to "  + celsius +" C.");




    }

}
