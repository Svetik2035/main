package Day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {
/* array variables*/
        int num =10;
        int[] arr = {10,20,30,40,50,60};
        //length: returns the total number of elements from the array
        // to find the last index number: arr.length-1
        int num1 = arr[arr.length-1];
        //                     6 -1 = 5
        System.out.println(num1);
        System.out.println("=====================================");

        //expected: 10 20 30 40 50 60
        for(int x = 0; x< arr.length; x++){
            System.out.print(arr[x] + " ");

        }
        System.out.println("\n========================================");
        //arrays.toString(VariableName):
        String str = Arrays.toString(arr);
        System.out.println( str );

        //Task01: write a program that asks user to enter a program 5 times
        // and store those numbers into array;
        int [] numbers = new int[5];

        Scanner scan =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an int number: ");
            int input = scan.nextInt(); // returns int data type
            numbers[i] = input;// or do in one step numbers[i] = scan.nextInt ();

        }
        System.out.println(Arrays.toString(numbers));

        //Arrays.sort(variableName): sorts the array in ascending order
        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length - 1];// method to find out last index number
        int minNumber = numbers[0];
        System.out.println("largest Number is = " + largestNumber);
        System.out.println("min Number  is = " + minNumber);



    }
}
