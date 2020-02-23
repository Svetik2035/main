package day25;

import java.util.Arrays;

public class WarmUp_CheckArraySortedOrNot {
    public static void main(String[] args) {
       // int [] nums = {13,31,8,5,21,2};
        int [] nums = {1,2,3,4,5,6};

        System.out.println("Arrays.toString 0nums = " + Arrays.toString(nums));
        int numsItemCount = nums.length;// storing the size of an array into a variable
     // I want to copy the content of nums array into the new array

       //creating an array with the same size as original array
       int[] numsCopy = new int[numsItemCount];
     /*  numsCopy[0] = nums[0];//copy one by one
        numsCopy[1] = nums[1];
        numsCopy[2] = nums[2];
        numsCopy[3] = nums[3];
        numsCopy[4] = nums[4];
        numsCopy[5] = nums[5];
        solving through the four loop is faster*/

        for (int x = 0; x < numsItemCount; x++) {
            numsCopy[x] = nums[x] ;
        }

        System.out.println("Before sorting nums Copy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sorting nums Copy = " + Arrays.toString(numsCopy));

        //check weather the array still has the same content in same order after sorting
        // what method will check for a content

        if(Arrays.equals(nums, numsCopy)) {
            System.out.println("THIS ARRAY IS ALREADY SORTED");

        }else{
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED");
        }
        //plain english logic to see 7 numbers are sorted or not
        //you copy these 7 numbers in another container
        // sort the numbers and check weather it still has the same order as an original number
        // why did we copy? Because
    }

}
