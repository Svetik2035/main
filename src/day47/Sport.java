package day47;

//public final class Sport {
    // final class cannot be extended
public class Sport{
    // final method cannot be overridden in sub class
    //it can be just used as is in sub class
    //just like family tradition
    //it should stay the same in generations to come
    // we can just use it as is
    public final void doSomething(){
        System.out.println("doing regular sport");
    }
    public void doSomethingElse(){
        System.out.println("doing something else in extreme sports");
    }
}
