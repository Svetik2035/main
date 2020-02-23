package Day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
        String name = giveMeMyName();
        System.out.println("name = " + name);
        // I want to create a static method called giveMeMyName
        //it returns your name as a result
        //it has no parameters
        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        System.out.println("result of doubling  100 is " + doubleTheNumber(100));
        System.out.println(doubleTheNumber(15));
        System.out.println(doubleTheNumber(5));

        int add14to16Result = add2Numbers (14,16);
        System.out.println("add 14 to 16 Result = "+ add14to16Result);

        System.out.println(  add2Numbers(14,16) );
        System.out.println(  add2Numbers(14,16) + 5);

    }
    public static int add2Numbers(int num1 , int num2){

     return num1 + num2;//return the sum

    }
    public static int doubleTheNumber (int num){
        System.out.println("I am going to double the value of " + num);
        int result = num * 2 ;
        return result ;// whole purpose of writing  a method  that returns the value
        //so we can save the result after calling the method
        // and use it somewhere else
    }
        public static String giveMeMyName() {
     return "Svetlana";

        }
}
