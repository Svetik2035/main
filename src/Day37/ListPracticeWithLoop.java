package Day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        /**
         * Create an ArrayList of integer  and fill it up with 1-100
         */
        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {
            nums.add(number) ;
        }
        System.out.println("nums = " + nums);
        //change all the odd number value to 0;
        for (int i = 0; i < nums.size(); i+=2) {
            nums.set(i, 0);
           // System.out.println("Odd Values are at index = " + i);

        }
        System.out.println("Nums = " + nums);

        //Insert 100 to 1-st index:
        nums.add(0,100);
        System.out.println("nums = " + nums);




        }
    }



