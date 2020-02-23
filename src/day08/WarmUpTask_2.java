package day08;
import java.util.Scanner;
public class WarmUpTask_2 {
    public static void main(String[] args) {

        /*Task 2:
        Create  (program) to get your favorite number
        Create a variable called myFavoriteNumber as int
        Ask user to guess you favorite number
        if guessed right 300 ; then print BINGO!!
        if not 300, print try again later
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("GUESS MY FAVORITE NUMBER : ");
        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber == 300 ) {
            System.out.println("BINGO!!!!!");
        } else {
            System.out.println("YOU ARE NOT MY BEST FRIEND, TRY AGAIN !");
        }




        }

    }

