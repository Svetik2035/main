package day31;

public class Calculator {
    public static void main(String[] args) {
        // create a static method that add
        // it accepts 2 numbers and print the result of addition
        add(6, 23);
        add(16, 3);
        add(1, 6);
        add3Numbers(1,5,99);
    }
    public static void add(int num1 , int num2 ){

        System.out.println("addition result " + (num1 + num2));
    }
    public static void add3Numbers(int num1 , int num2 ,int num3  ){
        System.out.println("add 3 numbers result " + (num1 + num2 + num3));
    }
}
