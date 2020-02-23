package Day26;

public class ArrayTask_NumberTest_Logic2 {
    public static void main(String[] args) {
        /**
         * 1. given an int array
         * write a program to test all elements inside this array are more that 100
         */

        // create a variable called finalResults to store
        //your result of checking if every number in this array is more than 100




         /* Logic 2: EARLY EXIT
         assume initial value for final Result  is Yes
         check each Item
         break as long as one number is less than 100 100 after assigning final result is No
         if we never go inside condition, the final result will remain Yes
          */

        int[] scores = {156, 101, 76, 187, 87, 110};
        int size = scores.length;
        System.out.println("size = " + size);
        String finalResult = "Yes";
        for ( int eachNum : scores  ) {
            if(eachNum <= 100){
                finalResult = "NO ";
                break;
            }

        }
        System.out.println("finalResult = " + finalResult);

        /* Logic: minus 100 from all numbers in array and  if any of the numbers are negative, it will be No*/

         /* Logic find min number more than 100 yes*/



    }
}
