package Day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {

       /* Array sorting method
        int [] nums ={1,5,3,4,7,2} ;
        System.out.println("before sorting nums = " + Arrays.toString(nums));
        Arrays.sort(nums) ;
        System.out.println("after sorting nums = " + Arrays.toString(nums));   */

       //calling to this method give the same this as use array sorting method
        int [] nums ={1,5,3,4,7,2} ;

        System.out.println("before changing nums = " + Arrays.toString(nums));
        changeArrayFirstItemTo100(nums); ;
        System.out.println("after changing nums = " + Arrays.toString(nums));


    }
    public static void  changeArrayFirstItemTo100 (int [] numbers){

        // take a first item out of an Array and assign it to 100
        numbers [0] = 100 ;

    }
    public static int addOneHundredAndReturn (int x){
        return x;

    }
}
