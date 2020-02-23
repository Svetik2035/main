package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {

        /*
        Amazon have two types of users:Prime member and another is regular member
        Prime member get free shipping in all purchase no matter the amount
        regular member get free shipping only  if their  purchase is more than than $ 25
        otherwise they  get $5 shipping fee
         */
        String memberType ="member" ;
        double amount = 15.99d ;
        int shippingFee= 0 ;
        /* first, I need to check if I am a prime member or not
                 */
       if ( memberType.equalsIgnoreCase( "PRIME MEMBER")) {

           System.out.println("YOU GET 1 DAY FREE SHIPPING !!!!!");
           System.out.println("your final price is " + amount);
           //} else if( amount > 25 ) { or you can do it another way
       } else if(!memberType.equalsIgnoreCase( "PRIME MEMBER") && amount > 25) {

           System.out.println("NOT A PRIME MEMBER, BUT YOUR ORDER IS MORE THAN 25");
           System.out.println("YOU GOT FREE SHIPPING");

       } else {
           System.out.println("DO YOU WANT TO SIGN UP FOR PRIME MEMBERSHIP?");
           shippingFee = 5;
           amount= amount + shippingFee;//amount+= shippingFee
           System.out.println("YOUR FINAL AMOUNT IS " + amount);

       }


    }
}
