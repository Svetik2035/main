package day31;

public class Calculator_V2 {
    public static void main(String[] args) {
       /* char operator = '+';// it can be + - * /
        int num1 =10 ;
        int num2 = 3 ;*/

       calculate('-',10,30 );
        calculate('+',20,10 );
        calculate('*',40,3 );
        calculate('/',40,4);
        calculate('A',40,4 );

    }
    public static void calculate(char operator , int num1 , int num2 ){//order of the parameters is matter

        switch (operator){
            case'+' :
                System.out.println("Addition result is " + (num1 + num2));
                break;
            case'-':
                System.out.println("Subtraction result is " + (num1 - num2));
                break;
            case'*':
                System.out.println("Multiplication result is " + (num1 * num2));
                break;
            case'/' :
                System.out.println("Division result is "  + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }



    }
    public static void add3Numbers(int num1 , int num2 ,int num3  ){


    }
}
