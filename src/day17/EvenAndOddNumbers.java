package day17;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int counter =0 ;

        while ( counter<=50 ) {
            System.out.print(counter +" ");
            counter += 2;//counter = cnt + 2

        }
        System.out.println();
        int cnt = 1;
        while(cnt <=50 ){
            System.out.print(cnt + " ");
            cnt += 2;
        }

        System.out.println();
        // I want to increment this loop by one
        int cnt2 = 0;
        while( cnt2<= 50 ) {

            if (cnt2 % 2 == 0) { //if divide this statement and we will get an even number
                System.out.println(cnt2 + "is even number");
            } else {
                System.out.println(cnt2 + "is odd number");
            }
            ++cnt2;
        }
    }

}
