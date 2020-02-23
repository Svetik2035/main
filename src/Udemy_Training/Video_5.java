package Udemy_Training;

import java.util.Scanner;

public class Video_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.println("Enter first num: ");
        first = num.nextFloat();
        System.out.println("Enter second num: ");
        second = num.nextFloat();
        result = first + second;
        result/=2;

        System.out.println("Result is = " +result);

    }
}
