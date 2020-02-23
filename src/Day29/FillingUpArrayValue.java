package Day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {

        //Create an array with size 100 and fill it up as below
        // fill up this array with numbers from 1 to 100
        int[] numbers = new int [100];

                                          //  \n will move it to next  line
        System.out.println("Before filling up \n" + Arrays.toString(numbers));// gives 100 zeroes: [{]00000000000...]
      /*  numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        ...
        numbers[99] = 100;
        we see the pattern and loop it will great in here
        */
        for (int x = 0; x < numbers.length ; x++) {
            numbers[x] = x +1 ;

        }
                               //  \n will move it to next  line
        System.out.println("After filling up default value \n "+ Arrays.toString(numbers));// gives numbers from 1 to 100[1,2,3,4,,5,6,7,8,9 ...100]
    }
}
