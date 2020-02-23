package Day57.Exception;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello B15 On Campus Friends!");
        //int num = 2.5;-> Compile Error
        int[] nums = new int[3];//0,1,2- indexes of elements

        nums[0]= 55;
        nums[1]= 56;
        nums[2]= 100;
       // nums[3]= 200;//-->this line will have ArrayIndexOutOfBoundsException
      // no lines will run after this point
     // System.out.println("Bye Bye Online Friends !");//this line will not print after the error
        int result = 10/0;// we cannot divide by 0
        //we will have error at runtime: ArithmeticException- it will be object of this class is created
        // and thrown in the memory
        System.out.println("result =" + result);// this will not print at all
      /*STACK TRACE
      Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Day57.Exception.ExceptionExample.main(ExceptionExample.java:15)
      * */

    }
}
