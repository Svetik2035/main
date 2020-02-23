package day31;

public class MethodIntro_1 {
    public static void main(String[] args) {
        System.out.println("Begin");
        sayHello();
        System.out.println("----------");
        sayHello();
        System.out.println("The End");
    }//MAIN METHOD ENDS HERE!!!

    //DO NOT CREATE A METHOD INSIDE YOUR MAIN METHOD!!!
    //IT CAN BE ANYWHERE INSIDE OF THE CLASS OUTSIDE OF MAIN METHOD
    public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is Svetlana");
        System.out.println("I love Java");
        // WHY DO WE NEED TO HAVE A METHOD
       // REUSABLE CODE !!!! AVOID CODE DUPLICATED



    }
}
