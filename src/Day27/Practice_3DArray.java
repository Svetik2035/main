package Day27;

public class Practice_3DArray {
    public static void main(String[] args) {
        int[][][]  arr3D = {   { {1,2,3}, {4,5,6} }  ,   { {7,8,9} , {10,11,12} } }  ;

        for (int i = 0; i < arr3D.length; i++) {// each index of 2D array
            for (int j = 0; j <arr3D[i].length ; j++) {//each number of 1D arrays
                for (int k = 0; k <arr3D[i][j].length ; k++) {//each index number of the value
                    System.out.print(arr3D[i][j][k]+" ");// it returns the values


                }
            }
            /*
            *
            *1. single dimensional array :contains multiple values:
            * int [] a ={1,2,3};
            * index:    0 1 2
            *
            * retrieve:
            * variableName[indexNum]
            * ex: arr[2] ==> 3
            *
            * Array's size if fixed
            *
            * 2.multi-DimensionalArray:
            *
            * ex: 2D (D for Dimensional) array : contains 1D arrays
            * length of 2D array ids determined by numbers of 1D arrays
            * int [] [] arr2D ={{1,2,3} ,{4,5,6}};
            * [index num of 1D array] [ index num of elements]
            *
            * arr2D [0] [1] ==> 2
            *  arr2D [0] ==>{4,5,6}
            *
            * Arrays util class:
            *      Arrays.toString(): converts single dimensional array to String, returns as a String
            *
            *      Arrays.deepToString(): converts multi-DimensionalArray (3D) to String, returns as a String
            *
            *      Arrays.sort()
            *
            *
            * */
        }
    }
}
