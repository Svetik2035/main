package day31;

public class MethodPractice3 {
    public static void main(String[] args) {
        // create a method called countDownFrom20till1
        //to print odd numbers from 1-100 : printOddNumbers1to 100()
        //create a method to spell your name : Svetlana -->> S-v-e-t-l-a-n-a(without last dash)

        countDownFrom20till1();
        //System.out.println();
        printOddNumbers1to100();

    }
  public static void countDownFrom20till1(){

        // write a piece of reusable code to count from 20 to 1

      // give a name countDownFrom20till1                             : method name
      // no need for an object when being called             : static
      //it should be accessible anywhere in your project     :public
      // it does not return any value                        :void
      //does not need any eternal data when being called      :(nothing inside



      //DOES NOT MATTER WHERE YOU PUT THE METHOD
      //AS LONG AS IT'S INSIDE OF THE CLASS{}
      //AND OTSIDE OF ANY METHODS
      for (int i = 20; i >=1 ; i--) {
          System.out.print(i + " ");
        }
      System.out.println();
    }
     public static void printOddNumbers1to100() {

         for (int i = 1; i <=100 ; i++) {
             if(i % 2 ==1){
                 System.out.print(i + " ");
             }
         }

   //  public static void printSvetlana() {



         }

     }

