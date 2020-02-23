package day22;

public class StringArray {
    public static void main(String[] args) {
        /**
         * Create an String array with size that you define
         * and store all your household member names
         */
        String [] memberNames = new String[4];

        memberNames [0] = "Svetlana" ;
        memberNames[1] = "Oleg" ;
        memberNames[2] = "Denis" ;
        memberNames[3] ="David" ;

        System.out.println( memberNames[0]);
        System.out.println( memberNames[1]);
        System.out.println(memberNames[2]);
        System.out.println( memberNames[3]);
        // array is immutable means that you cannot change an internal structure of the object
        // if you have String abc = " Hello";
        //if you have abc.toUpperCase -->> it will create a new String object "hello"
        // and it does not change original "Hello" at all!!

        /**
         * Array is not resizable -->> you can change a data inside of it
         * if it will be the same size or smaller
         *  we can not change the size of array once we create them with certain size
         * However , we can change the elements inside this array
         *  and it means : IT IS NOT IMMUTABLE
         */


    }
}
