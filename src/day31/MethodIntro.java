package day31;

public class MethodIntro {
    public static void main(String[] args) {
    // two ways to call static method:
        /*1.ClassName.methodName(external data if needed)
        if you are in the same class
        you can directly call them
        methodName(external data if needed)
                 */
        // first way
      //  MethodIntro.sayHello();
        //second way
      //  sayHello();
        sayHello();
        sayHello();// if I will call this method two times, than it will just print it twice:
        /*Hello World
            My name is Svetlana
            I love Java
            Hello World
            My name is Svetlana
            I love Java*/



    }//MAIN METHOD ENDS HERE!!!

    //DO NOT CREATE A METHOD INSIDE YOUR MAIN METHOD!!!
    public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is Svetlana");
        System.out.println("I love Java");
    }
}
