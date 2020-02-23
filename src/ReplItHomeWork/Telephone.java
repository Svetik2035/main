package ReplItHomeWork;

public class Telephone {
    String number ="";
    public static int quantity = 250;
   public static double total = 15658.92d;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String toString() {
        return "Telephone{" +
                "number='" + number + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }

    public void setNumber() {
    }
}
