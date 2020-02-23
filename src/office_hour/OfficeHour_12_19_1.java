package office_hour;
import java.util.Arrays;

public class OfficeHour_12_19_1 {
    public static void main(String[] args) {
        /*Array is a variable that can have multiple data elements
when we declare an array we declare a data type of Array :
          1.String, int, etc;
          2. when we want a compiler to recognize an array we put "[]" and than we can
          3. give a variable name,
          4.than we put "=" and on the right side we give data elements,
           as many elements as we want.
          5.one more special thing about an array: each element of data has represented index number
          6.in one array we only can have the same data-type!!!
          7.

          it looks like this: data-type[] variableName = {data1, data2, ....}
    //index numbers of array elements                       0       1
          // must MATch the data-type that we declared!
         */
        int a  ='A';
        //  index#:    0        1     2       3
        int [] arr = {10, (byte) 9, (short)8,'a'};
        System.out.println(Arrays.toString(arr));// this will print out: [10, 9, 8, 97]
        // we can assign byte, short
        //  or even char to our int array, it has to assigned to match this data type,
        //  otherwise, it will give me a compiler error; moreover, we cannot store neither long (it is larger than int),
        //  float, double (have decimals and they will give a compiler error,
        //  or a String (it will give a compiler error as well.

        long l1 = 100; //100 is an int and it will casted into a long and it will be implicit casting:
       // by default 100 is an integer, and we assign it to long data type
        //int num1 = l1;//explicit casting done manually, that is why we have to tell the compiler:
        int num1 =(int)l1;

        /**
         *     it looks like this: data-type[] variableName = {data1, data2, ....}
         * index numbers of array elements                       0       1
         *           // must MATch the data-type that we declared!
         *    variableName[0] ==> represents data1
         *    variableName[1] ==> represents data2
         */
        //to print  last element 97; 'a' = 97 in the ASCII chart
        // we will use the length method
        System.out.println(arr[arr.length - 1]);//data in the last index last index
         // this will print us 97

        /*FOR EACH LOOP: is used to access each data elements in the collection of data (array)
        the Each loop to created to access each of those data elements inside of an collection of data
         such as an Array.
        1. to declare for each loop:
        for(data_type each : arrayName(collection of data) ){
        2.How do we know number of times this loop will be executed:
        the number of executions of the loop depends on: on the length of an array
        (number of elements that this array contains).
         for example:
         if an array has 5 elements of data -- it will run 5 times;// executed 5 times
       3. there is no need to iterate for each loop, because it is a loop that is already been iterated
        example:
        int[] arr = {0,0,0 };
        variable "each" represents each element of the array
        for(int each: arr){
        4. for each loop cannot be executed more than or less than given times that we already established,
         equal to number of elements of data
         */
     int [] arr2 = {0,0,0};
     for(int each : arr2){

     }



    }
}
