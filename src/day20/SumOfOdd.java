package day20;

public class SumOfOdd {
    public static void main(String[] args) {

        int sum = 0;


        for (int sumOfOdd = 10; sumOfOdd <=100 ; sumOfOdd++) {
            System.out.println();
            if (sumOfOdd % 2 != 0){ //if (x % 2 ==1)
               // System.out.println(sumOfOdd + " is odd number");
                sum = sum+sumOfOdd; //sum += sumOfOdd

            //} else {
            //    System.out.println(sumOfOdd+ " is even number");
            }
            }
        System.out.println("sum = "+ sum);
        }
    }

