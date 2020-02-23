package day31;

public class Greeting {
    public static void main(String[] args) {
        //sayHello();
        sayHelloTo("Batch 15");//print: HelloBatch 15/ caller of this method
       sayHelloTo("Kids");//print: HelloKids
        sayHelloTo("Study Hard");

    }
    public static void sayHello(){
        System.out.println("Hello B15");

    }
    //I want to Create a method that will do what was said bellow:
    // say hello to the person's name that I passed when I called this method

    public static void sayHelloTo( String name ){// you vcan write whatever instead of name for example:String blabla
        System.out.println("Hello " + name);

    }


    }


