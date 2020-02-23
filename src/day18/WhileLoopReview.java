package day18;

public class WhileLoopReview {
    public static void main(String[] args) {
        int x = 10 ;
        while (x>5) {
            System.out.println(x + " ITS MORE THAN 5");
            --x;//we cannot put ++x, because this will create an infinite loop
        }
        System.out.println("THE END");
    }

}
