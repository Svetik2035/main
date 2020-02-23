package day50;

public class Division extends Question{

    public Division(int num1, int num2) {
        super("Division Question", "x");
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {

    }
}
