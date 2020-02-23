package Day32;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {
        // create a method called divide
        // it has 2 parameters and return the result as a double

        //System.out.println(10/0);
        System.out.println( divide(10,3));//3.33333
        System.out.println(divide (10,0 ));//infinity
        System.out.println(divide (0,10 ));//infinity
    }
        public static double divide (double num1 , double num2){
        if (num2 == 0 ){// we check if num2 is 0
           return 0 ;  // if it is just return 0.0
        }else{// if not,
            return num1/num2;// we just return actual result
        }




    }
}