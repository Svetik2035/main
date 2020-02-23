package Udemy_Training;

import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args) {

    int[] intArray = {2,15,7,1,3};
    Arrays.sort(intArray);
    // my first method to sort the array element by using for each loop
    //for(int item : intArray){
     //System.out.println("numbers " + item);
    //}
    //second way: use toString method:
        System.out.println(Arrays.toString(intArray));//[1, 2, 3, 7, 15]
    }

}
