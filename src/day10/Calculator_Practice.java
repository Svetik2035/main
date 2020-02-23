package day10;

public class Calculator_Practice {
    public static void main(String[] args) {

        char operator = '+';
        switch (operator) {
            //this case is equivalent to saying if(operator =='+')
            case '+':
                System.out.println("You are about to add numbers");
                break;
            case '-':
                System.out.println("You are about to subtract numbers");
            case '*':
                System.out.println("You are about to multiply numbers");
                break;
            case '/':
                System.out.println("You are about to divide numbers");
            default:
                System.out.println("Invalid Operator!!!");
            break;
        }

    }
}
