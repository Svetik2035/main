package day07;

public class Casting {
    public static void main(String[] args) {

        /*int num= 10;
        int 10 is implicitly (automatically) converted to double 10.0
        and stored inside bigNum behind scene
        */

        double bigNum = 10;
        System.out.println(bigNum);
        /*12.99 is double , double has much bigger range than int
        so it just does not fit
        int num = 12.99: //compiler Error!!!
         */
        int num = (int) 12.99;
        System.out.println(num);
        // create a long variable and store int

        long earthToMoon= 100000 ; //-->>100000L

        // create and int variable and try to store above long value
        // you an any name earthToMoonIn_int-- this just an example

        int earthToMoonIn_int = (int) earthToMoon;
        System.out.println(earthToMoonIn_int);

    }





    }

