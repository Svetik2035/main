package String_Methods;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        int numInt = 10;
        Integer numInteger = 10;

        double numdouble = 5.5 ;
        Double numDouble =5.5;

        long numlong = 20L;
        Long numLong = numlong;//assigning primitive to a class called auto-boxing

        System.out.println(numLong);
        System.out.println(numlong);

        //can we convert wrapper class to primitive?
        Boolean BooleanResult  = false;
        boolean booleanResult = BooleanResult;//unboxing

        char ch1 = 'L';
        Character ch2 =ch1;//auto-boxing
        char ch3 =ch1; //none

        char ch4 = ch2; //unboxing

        Character ch5 = ch2; //none

        System.out.println(ch1 );
        System.out.println(ch2);
        System.out.println(ch3 );
        System.out.println(ch4 );
        System.out.println(ch5 );

       //To make a wrapper-class just change the primitive variable into Wrapped Class
        // int [] arr =  new int [3] ; //[0,0,0] [null,null,null]
        Integer [] arr =  new Integer [3] ; //[0,0,0]
        System.out.println(Arrays.toString(arr));



    }

}
