package office_hour;

import java.util.Arrays;

public class Practice_12_12 {
    public static void main(String[] args) {
        /**
         * Practice
         * Array,
         * String,
         * Loop
         */

        int []  arr = new int[5];

        int [] arr2;
        //System.out.println(arr2 [0]);// array's  size is fixed, without  initializing  bits size we cannot use it
        //initializing the size of the array:
        /*1. given values
        int []  a = {1,2,3};
        it initializes the size and

         */
        String [] names = new String [5];
        names [2] = "Hassan";
        names [4] = "Parvin";
        System.out.println(Arrays.toString(names));

        int [] nums = new int [7];//highest index : 6
        // nums[7]= 10;
        System.out.println(Arrays.toString(nums));

        char [] characters = {'a','b','c', 'd'};

        String str1 = Arrays.toString(characters);

        System.out.println(str1);

        int [] scores ={10,9,8,7,6,5,4,3};
        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        String []  chars = "ABCD".split("");

        System.out.println(Arrays.toString(chars));

        char [] chars2 = "Vlad".toCharArray();

        System.out.println(chars2);

       // 1. write a program that can print out the unique values from an int Array

        int [] numbers = {1,1,2,2,3,4,4,5,5};

        for (int j = 0; j <numbers.length ; j++) {
        int count = 0;//find out number of appearance
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1) {
                    count++;// adds one to appearance
                }

            }
            if (count == 3) {
                System.out.println(j);
            }


        }



    }

}
