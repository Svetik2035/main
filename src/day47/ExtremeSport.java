package day47;

public class ExtremeSport extends Sport {

  /*  public void doSomething(){
        System.out.println("doing extreme sport");
} we cannot overide
but you can do anything else
for, example, you can overload it
*/
  public void doSomething (int x){
      System.out.println("doing extreme sport");
  }
    public void doSomethingElse(){
    //  super.doSomethingElse();- this is an option to call this method
        System.out.println("something else");
    }
}
