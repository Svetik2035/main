package Day26;

public class ArrayTask_NumberTest_Version2 {
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
         * Logic 1.2: take each item if it is More than 100, increase the count..
         * in the end if count is equal to array item final result is Yes, if not is  No*/
        int cntMoreThan100 = 0;
        for (int eachNum : scores) {

           if (eachNum > 100) {
               ++cntMoreThan100;// increasing the counter
            }

        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);

        if(cntMoreThan100 == scores.length) {// I can use su=ize instead of  scores.length
            finalResult = "Yes";
        }else{
            finalResult = "No";// the answer is NO,because not all the
            // items are more than  100 , there are 76 and 87 are less than  100
        }
        System.out.println("finalResult = " + finalResult);





         /* Logic 2: check each item and break when number is less than 100 after assigning final result is No*/

        /* Logic: minus 100 from all numbers in array and  if any of the numbers are negative, it will be No*/

         /* Logic find min number more than 100 yes*/



    }
}
