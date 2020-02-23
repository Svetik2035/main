package day39;

public class Car {
    //Create a Car Object template by creating a Car class
    //	it  has these attributes
    //		year , model , make , color
    //Create few object out of it with field value set (edited)
   int  year;
   String model ;
   String make ;
   String color ;

   // this is instance method
    // instance methods are tied to the object
    // it does not have a static keyword
    // we need an object when we call them
   public void goForward(){
       System.out.println("Going forward");
   }
   //Create a method to print how old is this car
    // we are calling to use the Object, not the Class like in regular method
    public void printYear(){
        System.out.println("car age : " + (2020 - year));
    }
    public void changeColorTo(String newColor){
       //write a bunch of code here to validate
        //for example: red, blue or gray are valid colors
        //ABC, YHT --are nor valid colors
        //color equals a newColor that user is specified
        color = newColor ;

    }
}
