package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine(); }

        System.out.println(arr[0]+ " , "+arr[1]);
        System.out.println(arr[2]+ " , "+arr[3]);
        System.out.println(arr[4]+ " , "+ arr[5]);
        System.out.println(arr[6]+ " , "+arr[7]);


    }
}
