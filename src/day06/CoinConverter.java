package day06;

public class CoinConverter {
    public static void main(String[] args) {

        //you have 200 cents
        //how many quarter you can get 25c
        //how many dime you can get 10c
        ////how many nickel you can get 10c

        int cent = 200 ;
        // you have purchase a candle for $0.74
        // what would be your remainder

        cent -= 74 ; //you have 126 cents left, after spending 74 cents for a candle
        int quarter = cent/25 ;//126/25-->> 5 ,1 is remaining
        int penny =  cent % 25 ;//126/25 -->> 5 ,1 is remaining
        System.out.println(quarter);
        System.out.println(penny);
        // now I want to try to calculate dime for the same money, I got after purchase
        //in dime


        int dime = cent/10;//-->> 126/10-->> 12 amd a remainder is 6
        //how much penny will I have after dime % 10 -->>6
        int cent2 = cent % 10;// -->>> 6
        int penny2 =  cent % 10 ;

        System.out.println(dime);
        System.out.println(penny2);

        int nickel =cent /5;


    }
}
