package day45;

public class Apple extends Fruit {
    // iF DO NOT HAVE ANY CONSTRUCTOR
    //we will get  a default constructor
    // and compiler will automatically call
    // no arg constructor of super class by inserting super()
    // FIRST LINE OF ANY CONSTRUCTOR IS AUTOMATICALLY CALLING
    //SUPER() IF WE DO NOT CALL ANY
    public Apple(){
    //I want reuse the functionality
    //Already written in super class constructor
        // you can use super()  or super (argument here)
        // super();
        // to call super class's constructor with one argument
    super("test");

    // we CANNOT use this super() MORE THAN ONCE!!!!!!!!
        System.out.println("Message from Apple Constructor");
}

    public static void main(String[] args) {
        Apple a1 = new Apple();
    }
}