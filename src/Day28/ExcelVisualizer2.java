package Day28;

import java.util.Arrays;

public class  ExcelVisualizer2 {
    public static void main(String[] args) {


        //                   0  1   2  3      0   1      0   1   2
     // int [][] myExcel = {{10,27,88,99 } , {87,100} , {90,45, 65}};// or another way below; they are the same
        //                         0             1            2
        int [][] myExcel = {//this is the beginning of the 2D array object
                                {10,27,88,99 }, //index 0:this is first 1D array
                                {87,100} ,      //index 1:this is second 1D array
                                {90,45, 65}     //index 2:this is third 1D array
                             };// this s the ending of 2D array object
        // what does deepToString method does:
        //it takes an multiD array and turn it into a string with all items
        //what do we need to provide?
        //the multiD array object or the multiD array variable
        // what we are getting out of it?
        //-->> String representation of multiD array object
        // we do the same thing and it does not matter if it is a String or int, etc.
        System.out.println(Arrays.deepToString(myExcel));
        for(int[]eachRow : myExcel ){

            for(int eachValue : eachRow ){

                System.out.print(eachValue + " ");//this is printing all the numbers in one line
            }
            System.out.println();// this printing each array in the separate line

        }
    }
}
