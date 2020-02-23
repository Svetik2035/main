package day49;

public class Burger implements Edible, Juicy{
// you are building super-sub relationship , IS-A relationship
// a class can only extends one other class
// a class can implements multiple interfaces

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting ");
    }


    @Override
    public void eat() {
        System.out.println("Eating a burger with a big bite");
    }
    // we have all of three below by default:
    //1.public static final boolean IS_HUMAN_FOOD = true;
    //2.public Burger(){}
    //3.super()

    @Override
    public void drink() {
        System.out.println("Eat burger, than drink a soda");

    }
}
