package day50;

public class Addition extends Question {

    /*We have have all of them her, but they are not visible:
    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";*/

    public Addition(String questionType, String operator,int num1,int num2) {
        super("addition question ", "+");
        this.num1=num1;
        this.num2=num2;
    }

    public Addition(int num1, int num2) {
        super();
    }

    @Override
    public void calculate() {
        answer = num1 + num2;
        // if you come to this point it means you called
        // the calculate method to calculate the result
        calculated = true;
    }

    @Override
    public String toString() {

        if (calculated == true) {
            return num1 + operator + num2 + " = " + answer;
        } else {
            return num1 + operator + num2 + " = ";
        }

    }
}
