package Day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {
                                  // 0 1  2 3 4 5  6
        int[] myNumbers = new int []{5,3,21,1,2,13,8};
        int size =myNumbers.length;
        int lastIndex = size -1;
        int middleIndex = size/2;//gives 3

        //just to see what is inside of an Array
        System.out.println(Arrays.toString(myNumbers));
        //print out first and last numbers
        System.out.println( myNumbers[0]+ " --- " + myNumbers [ lastIndex - 0 ]);// 0

        System.out.println( myNumbers[1]+ " --- " + myNumbers [ lastIndex - 1 ]);

        System.out.println( myNumbers[2]+ " --- " + myNumbers [ lastIndex -2 ]);

        //loop it
        System.out.println("---------for loop here--------------");

        for (int x = 0; x <middleIndex ; x++) {
                            // first number to swap     second number to swap
            System.out.println("Before swap " + (myNumbers[x] + " --- " + myNumbers[lastIndex - x]));
            int temp = myNumbers [x];
            myNumbers[x] = myNumbers[lastIndex - x];
            myNumbers[lastIndex - x] = temp;
        }
        System.out.println("After swap complete " + Arrays.toString(myNumbers));
    }
}
