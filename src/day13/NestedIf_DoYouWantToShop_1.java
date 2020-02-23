package day13;

class NestedIf_DoYouWantToShop_1 {

        public static void main(String[] args) {

        /*
        create a boolean value to store the result of do youWantToShop
        if yes, do you want to go to store or do want to shop online
                 */
            boolean youWantToShop = true;
            String preference = "ONLINE";

            if ( youWantToShop ==true) { //one if statement inside another if statement
                //if ( youWantToShop) ; or above, are the same
                if(preference.equals("Store")) { //either"Store" or "Online"
                    System.out.println("GOING TO STORE SHOPPING");
                }else{
                    System.out.println("GOING TO ONLINE SHOPPING");
                }

            }else {
                System.out.println("GOOD JOB, STAY HOME CODING !!!!!");

            }



        /*String memberType ="member" ;
        double amount = 15.99d ;
        int shippingFee= 0 ;
        /* first, I need to check if I am a prime member or not
                 */
      /* if ( memberType.equalsIgnoreCase( "PRIME MEMBER")) {

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
       */


        }
    }



