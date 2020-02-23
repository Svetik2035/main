package day20;

public class SumOfEvenOddSeparately {
    public static void main(String[] args) {

//  Give me the sum of odd numbers and even numbers from
//  10 - 100 , use for loop
//// hint : create a variable sumOfOdd and sumOfEven as int
/// loop through 10-100
////  in each iteration check it's a even number or not
////    if it's add that number to sumOfEven
//        if not add that number to sumOfOdd
//
//    eventually after the loop -->> print out sum value
        int sumOfEven = 0 ;
        int sumOfOdd =0 ;
        int sum = 0 ;
        //this is like previous example that what is about
        // nothing has been added yet so it is 0
        //sum = sum +1 //1
        //sum = sum +2 //3
        //sum = sum +3 //6
        //sum = sum +4 //10
        //sum = sum +5 //15
        //sum = sum +6 //21
        //sum = sum +7 //28
        //sum = sum +8 //36
        //sum = sum +9 //45
        //sum = sum +10//55


        for (int i = 10; i <=100 ; i++) {
            //if it is an even number, add that to sumOfEven
            if(i % 2 == 0){
                sumOfEven = sumOfEven + i;
                //if it is an odd number, add that to sumOfOdd
            }else{
                sumOfOdd = sumOfOdd + i ;
            }
            System.out.println("sumOfOdd = " + sumOfOdd);
            System.out.println("sumOfEven = " + sumOfEven);
        }

        }
    }

