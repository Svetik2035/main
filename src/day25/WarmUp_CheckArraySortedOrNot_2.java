package day25;

import java.util.Arrays;

public class WarmUp_CheckArraySortedOrNot_2 {
    public static void main(String[] args) {
        int [] nums = {13,31,8,5,21,2};// THIS ARRAY  IS NOT SORTED
       // int[] nums = {1, 2, 3, 4, 5, 6};// THIS ARRAY IS ALREADY SORTED

        System.out.println("Arrays.toString(nums = " + Arrays.toString(nums));
        boolean isSortedAlready = true;
        for (int x = 0; x <nums.length-1 ; x++) {//
           // System.out.println( nums[x]);//to print one item at the time
            System.out.println( nums[x] + " " + nums[x+1]);
            //pick first item and compare with second item
            //keep repeating until there is no more items

            //print is item1 is less than item2
            System.out.println("is "+nums[x] + " less than "+  nums[x+1] + " ? " + (nums[x] < nums[x+1]));
            if( !(nums[x] < nums[x+1])) { // if this statement is not true
                System.out.println("ARRAY IS NOT SORTED, NO POINT FOR CHECKING THE REST");
                isSortedAlready = false ;
            }

        }
        System.out.println("isSortedAlready = " + isSortedAlready);
    }
}
