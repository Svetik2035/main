package Udemy_Training;

public class Application_StringClass {
    public static void main(String[] args) {
        int myInt = 7;
        String text = "Hello";
        String blank = " ";
        String name = "Bob";
        String greeting = text + blank+ name;
        System.out.println(greeting);// or I can do it differently and get the same results

        System.out.println("Hello" + " " + "Bob");//like this to do the concatenation of Strings

        System.out.println("My integer is: " + myInt);//to do the concatenation of String and int
    }
}
