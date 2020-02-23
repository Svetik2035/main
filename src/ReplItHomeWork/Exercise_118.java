package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_118 {
    public static void main(String[] args) {
       /* Instructions from your teacher:
        The code provided in your main method will take in six Strings and save them into an array called arr.
        Print out the 43 neighboring items of array in one line until the last line
        each line should contain 3 neighboring items of array element as displayed below
        user for loop
        Example:
        arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
        prints:  apple , banana , kiwi
        banana , kiwi , grape
        kiwi , grape , milk
        grape , milk , soda*/
       Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        System.out.println(arr[0]+ " , "+arr[1]+" , "+arr[2]);
        System.out.println(arr[1]+ " , "+arr[2]+" , "+arr[3]);
        System.out.println(arr[2]+ " , "+arr[3]+" , "+arr[4]);
        System.out.println(arr[3]+ " , "+arr[4]+" , "+arr[5]);

    }
}
