package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {
        int cnt1 = 100;
        while( cnt1 >0 ) {

            if (cnt1 % 2 == 0) { //if divide this statement and we will get an even number
                System.out.println(cnt1 + " is an even number");
            }
            cnt1+=2;
        }

    }
}
