package day06;
import java.util.Scanner;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {


        int myFavoriteNumber = 300 ;

        System.out.println("My FavoriteNumber " + myFavoriteNumber);

        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("Your FavoriteNumber " + yourFavoriteNumber) ;

        yourFavoriteNumber = 100;

        System.out.println("My FavoriteNumber " + myFavoriteNumber);

        System.out.println("Your FavoriteNumber " + yourFavoriteNumber);

        //create a variable called yourOrder , type a String and assign a value
        //create another variable

        int yourOrder = 135;
        int myOrder = yourOrder ;

        System.out. println("Your order " + yourOrder);
        System.out. println("My order " + myOrder);

        String yourBuy = "Gucci Bag";
        String myBuy = yourBuy ;

        System.out. println("Your Buy " + yourBuy);
        System.out. println("My Buy " + myBuy);

        // to do it Scanner way

        Scanner input = new Scanner(System.in);

        System.out.println( "What is your order ? I want The same!");// finish it




    }
}
