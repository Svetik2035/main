package office_hour;

import java.util.Arrays;

public class Office_Hour_12_27_2 {
    /*1. write a method that can convert km to miles
	 				Hint: 1 km = 0.612 miles*/
    public static double ConvertKmToMiles (double km){
        double miles = km * 0.612;

        return miles;
    }
	 /*	2. write a method that can convert gallons to litters
	 			   Hint: 1 G = 3.75 L*/
	 public static double ConvertGallonsToLiters(double gallons){
	     double litters = gallons *3.75 ;

	     return litters;
     }
	 /*	3. write a method that can print out the array in Descending order*/
    public static void descOrder(int[]array){
        Arrays.sort(array);
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
	 	/*4. write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
			Ex: calculate(10, 2, "*") ==> 20;
				calculate(20, 2, "~") ==> invalid operator*/
	 	public static void calculate(int a, int b, String operators){

	 	   boolean result = (!operators.equals("-") ||!operators.equals("+") || !operators.equals("*")
                            ||!operators.equals("/") ||!operators.equals("%") );


            if(operators.equals("-")){
                System.out.println(a-b);
            }else if(operators.equals("+")){
                System.out.println(a+b);
            }else if(operators.equals("*")){
                System.out.println(a*b);
            }else if(operators.equals("/")){
                System.out.println(a/b);
            }else if(operators.equals("%")) {
                System.out.println(a % b);
            }else {
                System.out.println("Invalid operator");


            }

    }

		/*5. write a method that can calculate grade
					if score is 100 ~ 90 ==> A
					if score is 89 ~ 80 ==> B
					if score is 79 ~ 70 ==> C
					if score is 69 ~ 60 ==> D
					if score is 0 ~ 59 ==> F
					otherwise ==> Invalid Score*/
    public static void main(String[] args) {
        oddEven(100);//100 is even number
        oddEven(101);//101 is odd number
        System.out.println(ConvertKmToMiles(50));
        System.out.println( ConvertGallonsToLiters(100));
        int[] array ={ 2,3,1,20,30,55};
        //descOrder();

    }

       //write a method that can verify any number if it's even or odd
        public static void  oddEven(int number){
            if(number%2==0){
                System.out.println(number + " is even number");
                return;
            }
            System.out.println(number + " is odd number" );
    }
}
