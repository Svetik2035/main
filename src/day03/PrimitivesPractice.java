package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26 ;
        System.out.println ("The letter count is " +   letterCount ) ;

        short sheepCount = 300 ;
        int catCount = 20;
         System.out. println("Cat Count " +  catCount ) ;
        System.out.println("Sheep count: " + sheepCount);

        long milesToSun = 10000000L;
        long milesToMoon = 5000000l;

        System.out.println("miles to moon " +    milesToMoon    ) ;
        System.out.println("Miles To Sun: " + milesToSun);

        //---------Floating point--------
        // you must add f or F at the end of the number to indicate that this is the float data type
        // upper case or lower case is does not matter, but it's mandatory!

        float priceOfBanana = 1.99f ;
        float priceOfPotatoes = 2.49F ;

        System.out.println("Price of Banana: "   +   priceOfPotatoes  ) ;
        System.out.println(priceOfBanana);
        System.out.println(priceOfBanana + priceOfPotatoes );
        System.out.print(priceOfBanana + " + " +priceOfPotatoes + " = " + "6.47");
        System.out.println();


        // ----- larger floating point numbers-----
        double priceOfIPad1  = 355.99D ;
        double priceOfIPadPro = 1024.99D ;
        // compiler automatically assumes it's a double so it's not required to have D at the end
        //however, for a good programming habit, add them always
        double priceOfMac   = 2299.99 ;
        // If you have a whole number by itself, compiler automatically assume it is an int
        //if you have a fractional number by itself, compiler automatically assume it's an double

        System.out.println("Price Of IPadPro: "   +   priceOfIPadPro  ) ;

        System.out.println("Price Of IPad1: "   +  priceOfIPad1 ) ;

        System.out.println("Price Of Mac: "   +   priceOfMac  ) ;



    }
}
