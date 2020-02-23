package Udemy_Training;
class Animal{
    public void Talk(){
        System.out.println("Animal is talking");
    }
}

class Tiger extends Animal{
// in this class I have two methods, one is inherited
// from Animal class--> Talk()
    //and one is belongs to this class --> Hunt()
    // I can override the instance methods in the sub class
    public void Hunt(){
        System.out.println("Tiger is hunting");

    }
    // we are overriding the Talk method from Animal  super class to
    //Tiger sub class
    public void Talk() {
        System.out.println("Tiger is talking ==> Roar");
    }
}
  class Octopus extends Animal{
   public void Swim(){
      System.out.println("Octopus is swimming");
  }

      public void Talk() {

          System.out.println("Octopus is talking ==> gologolo");
      }
}
public class Zoo {

    public static void main(String[] args) {
        // first, we will create an object:
        Tiger tiger1 = new Tiger();
// Array supports the Objects and we are going to create an Array
        Tiger [] Tigers = {tiger1, new Tiger() };

        Octopus octopus1 = new Octopus();
        Octopus[] octopus = {octopus1, new Octopus() };
        // when we make an Animal (parent class) as reference type
        //the Object that we allowed to create from it's sub class
        // which means that parent class can be the reference of child
        //class Object, and it called Polymorphism

 //reference type   referenceName     Object
   // Animal        animal1       = new Tiger();

        Animal animal1 = new Tiger();
        Animal animal2 = new Octopus();
    }

}
