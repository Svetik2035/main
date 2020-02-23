package Day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
        /**write a static void method to accept a long array.
         It should swamp first value with last value of the array
         *
         */
        long [] myLongs = {6L, 11L, 44L, 32L, 65L} ;

        System.out.println("Before swapping myLongs = " + myLongs);
         swapFirstAndLastValue( myLongs);
        System.out.println("After swapping myLongs = " + myLongs);

        long[]  myNums1 = new long[5];
        System.out.println("myNums1 = " + Arrays.toString(myNums1));

        String[]  names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        long[]  myNums2 = new long[5];
        System.out.println("Arrays.toString(myNums2) = " + Arrays.toString(myNums2));


    }
    public static void swapFirstAndLastValue(long[] nums){
        long temp = nums[0] ;
        nums[0] = nums[ nums.length-1] ;
        nums[ nums.length -1]= temp;
    }
}
