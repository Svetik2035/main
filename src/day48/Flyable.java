package day48;
// this is how we create an interface
// no object can be created from it
//it provides guidelines for implementing classes
//it is like signing a contract
public interface Flyable {

    //an interface only have public static final field!!!
    public static final boolean HAVE_WINGS = true;

    // can we have a constructor? : NO!!!
    public abstract void fly();

}
