package day21;

public class OrderOfBreakContinue {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
           // break;//with break the loop will run iteration
            continue;
            //THIS WILL NOT WORK, UNREACHABLE CODE!!!
            //System.out.println("Hello");
        }
        System.out.println("THE END");
    }
}
