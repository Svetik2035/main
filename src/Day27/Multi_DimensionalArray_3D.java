package Day27;

import java.util.Arrays;

public class Multi_DimensionalArray_3D {
    public static void main(String[] args) {
        //N dimensional Array Must contain (N-1) dimensional arrays
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        //3D contains
        //   index    2D array   0        1            0            1
        //   index element   0   1  2   0  1  2      0  1   2    0    1   2
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9,}, {10, 11, 12}}};
        //   index of 3D               0                     1


        // print 9:
        System.out.println( arr3D[1][0][2] );       // returns value

        // print 2:
        System.out.println( arr3D[0][0][1]   );     // returns value

        // to print {1,2,3}:
        System.out.println( Arrays.toString(arr3D[0][0]));//returns 1 d

        // to print {10, 11, 12}:
        System.out.println( Arrays.toString(arr3D[1][1]));// returns 1 d

     // to print{ {7, 8, 9,} {10, 11, 12} }:
        System.out.println(Arrays.deepToString(arr3D[1]));// prints only D2 array number 1
        System.out.println(Arrays.deepToString(arr3D));// prints whole 3D

    }

}
