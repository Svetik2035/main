package ReplItHomeWork;

public class Exercise_190 {


    public static int[] mergR(int[] a,int[] b) {

    int lengthOfNewArr = a.length +b.length;// length of combined Array

    int[] newArr = new int[lengthOfNewArr];
     int z =0; // created an iterator
    for( int each: a){//loop through each element in array a
        newArr[z] = each;
        z++;
    }
    for( int each : b){////loop through each element in array b
        newArr[z]= each;
        z++;
    }
        return newArr;//return merged array
    }


    public static void main(String[] args) {



    }}


            /*Instructions from your teacher:
        mergR merges two arrays into one.
        it gets two int arrays and returns an int array

        for example:

        mergR([1,2,3],[4,5,6])
        returns [1,2,3,4,5,6]

        mergR([1,2],[6,8])
        returns [1,2,6,8]

        hint:
        create a length int for the combined length of both arrays.
        create an array with that length (that's the array we will return).
        create an iterator for both arrays (int z=0).

        loop first array and inside the loop insert current element
         to the return array (ret[z]=a[i];)
        then increment the iterator for both arrays (z++).

        do the same for the second array. */



