package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        //syntax for creating a variable to store a single item
        //  and assigning a value
        //dataType variableName = value here
        int num1 = 10 ;
        System.out.println("num1 = " + num1);
        //syntax for creating a variable to store multiple items
        //  and assigning a values
        //dataType [] variableName = new dataType [count of item] ;
        //this array has can hold 4 items , it's also known as array size
        
        // creating an array object with an empty space
        int [] scores = new int[4];// [4]-this is a count number, which says how many items in it
        scores [0] = 95 ;
        scores [1] = 70 ;
        scores [2] = 88 ;
        scores [3] = 100 ;
        
        //accessing the elements inside array one by one

        System.out.println( scores[0]);
        System.out.println( scores[1]);
        System.out.println( scores[2]);
        System.out.println( scores[3]);
        //scores are variables; array is an object with empty slot

        //updating the value at certain index
        scores [1] = 99 ;
        System.out.println( scores[1] );
        // once array is created with certain size , WE CANNOT CHANGE THE SIZE,
        // but we can change the input in array, which will be limited by the capacity
        //for example if it is: int [] scores = new int[4];, can have 4 only, and it has capacity ofm 1-4

        /*when you create a new Array Object
        it will get default value in each element
         */
        int [] numbers = new int[3];// [4]-this is a count number, which says how many items in it
        System.out.println( numbers [0]);
        System.out.println( numbers [1]);
        System.out.println( numbers [2]);

        byte [] data = new byte[4];

        data [0] = 35 ;
        data [1] = 73 ;
        data [2] = 13 ;
        data [3] = -5 ;

        System.out.println( data[0]);
        System.out.println( data[1]);
        System.out.println(data[2]);
        System.out.println( data[3]);









    }
}
