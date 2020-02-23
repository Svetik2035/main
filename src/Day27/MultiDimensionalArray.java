package Day27;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /**
         * 1.Single dimensional array: contains values
         * int[] arr ={1,2,3];
         * 2.Multidimensional Array:
         * an Array that can contain array(s)
         * the formula is: N dimensional Array Must contain(N-1) dimensional Arrays
         *
         * based to this formula:2 dimensional array: contains several 1 dimensional arrays
         * int[] [] arr2D ={ {1,2,3}  , {4,5,6}};
         */
        int[] arr1D =  {1,2,3};

        //2D array: is an array that contains single dimensional arrays
        int [][] arr2D = { {1, 2, 3} , {4, 5, 6} };
        //index:             0          1

        // arr2D [0] ==>{1, 2, 3}; or arr2D [1] ==> {4,5,6};
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString( arr2D[0]));
        System.out.println(Arrays.toString( arr2D[1]));

        //arr2D [0] [2] ==>3--the int value in the first array[0]
        System.out.println( arr2D [0] [2]);
        //arr2D [1] [1] ==>5--the int value in the first array[0]
        System.out.println( arr2D [1] [1]);

        // how can we print an entire array
      //  System.out.println(Arrays.toString ( arr2D));//Arrays.String is only applicable to single array

        //Arrays.deepToString(multi-D Arrays);
        System.out.println(Arrays.deepToString ( arr2D));


    }

}
