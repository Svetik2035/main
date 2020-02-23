package day31;

public class MethodPractice2 {
    public static void main(String[] args) {
        count1to10();
        //System.out.println();
        count1to10();
        MethodPractice2.count1to10();

    }
  public static void count1to10(){

        // write a piece of reusable code to count from 1 to 10

      // give a name count1to10                              : method name
      // no need for an object when being called             : static
      //it should be accessible anywhere in your project     :public
      // it does not return any value                        :void
      //does not need any eternal data when being called      :(nothing inside



      //DOES NOT MATTER WHERE YOU PUT THE METHOD
      //AS LONG AS IT'S INSIDE OF THE CLASS{}
      //AND OTSIDE OF ANY METHODS
      for (int i = 1; i <=10 ; i++) {
          System.out.print(i + " ");
        }
      System.out.println();
    }
}
