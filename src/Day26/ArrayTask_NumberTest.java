package Day26;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {
        /**
         * 1. given an int array
         * write a program to test all elements inside this array are more that 100
         */
        int[] scores = {156, 101, 76, 187, 87, 110};
        // create a variable called finalResults to store
        //your result of checking if every number in this array is more than 100

        String finalResult = "";//if all numbers are more than 100 then , make it yes, if not make it no
        /**
         * Logic 1: take each item and check if it is less than 100, count.
         * in the end if count is more than 0, answer is No*/
        int cntLessThan100 = 0;
        for (int eachNum : scores) {

            if (eachNum > 100) {
                System.out.println("eachNum =" + eachNum);
                cntLessThan100++;
            }

        }
        System.out.println("cntLessThan100 = " + cntLessThan100);
        if(cntLessThan100>0) {
            finalResult = "No";
        }else{
            finalResult = "Yes";
        }
        System.out.println("finalResult = " + finalResult);





         /* Logic 2: check each item and break when number is less than 100 after assigning final result is No*/

        /* Logic: minus 100 from all numbers in array and  if any of the numbers are negative, it will be No*/

         /* Logic find min number more than 100 yes*/



    }
}
