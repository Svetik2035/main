package day17;

public class FizzBuzz {
    public static void main(String[] args) {
        // if a number can be divide by 3 and 5 -->> FizzBuzz number
        // if a number can be divide by 5 -->> Fizz number
        // if a number can be divide by 3 -->> Buzz number

        int num = 1;
        while (num <= 50) {

            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is Fizz Buzz number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is Fizz number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is Buzz number");
            }
            ++num;

            //int num1 = 1;
            //while(num1<= 100) {
            // System.out.println(num1);
            //++num1;
            //}
        }
    }
}


