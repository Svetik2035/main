package Day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {

        //Create an array with size 100 and fill it up as below
        // fill up this array with even number from 0
        int[] numbers = new int [100];

                                          //  \n will move it to next  line
        System.out.println("Before filling up default value \n" + Arrays.toString(numbers));// gives 100 zeroes: [{]00000000000...]
       /* this is what we will do without the loop
        numbers [0] = 0;
        numbers [1] = 2;//1*2
        numbers [2] = 4;//2*2
        numbers [3] = 6;//3*2
        numbers [4] = 8;//4*2
        numbers [5] = 6;//5*2
        //....
        numbers [99] = 198;//99*2*/

        //numbers[x] = x*2
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i * 2 ;

        }
        System.out.println("After filling up \n" + Arrays.toString(numbers));

       // Create an array with size 300 and fill it up with I Love Java

        /* I made this way:

        String [] love = {"I love Java"};

        for (int i = 0; i <300 ; i++) {
            System.out.print("I love Java ");

        }  */

        // Create an array with size 300 and fill it up with I Love Java
        String[] strArr = new String[300];
        System.out.println("before filling strArr = " + Arrays.toString(strArr));
//        strArr[0] = "I Love Java";
//        strArr[1] = "I Love Java";
//        strArr[2] = "I Love Java";

//        strArr[0] = "1.I Love Java";
//        strArr[1] = "2.I Love Java";
//        strArr[2] = "3.I Love Java";
        // 300
        for (int i = 0; i < strArr.length; i++) {
            //strArr[i] =   "I Love Java";
            strArr[i] = (i + 1) + ".I Love Java";
        }
        System.out.println("strArr = " + Arrays.toString(strArr));

        String str = new String("ABC");   // THIS IS STRING OBEJCT WITH VALUE ABC
        String[] strArr2 = new String[5]; // EMPTY STRING ARRAY WITH CAPACITY 5 ,
        strArr2[0] = "i LOVE JAVA";
        strArr2[1] = "i LOVE JAVA";
        strArr2[2] = "i LOVE JAVA";
        strArr2[3] = "i LOVE JAVA";
        strArr2[4] = "i LOVE JAVA";
        System.out.println("strArr2 = " + Arrays.toString(strArr2));


    }

}