package office_hour;

public class Practice_11_13 {
    public static void main(String[] args) {


        byte letterCount = 26;

        System.out.println("   The letter count is" + letterCount);


        short sheepCount = 300;
        int catCount = 20;
        System.out.println("   sheepCount" + catCount);

        long milesToSun = 10000000L;
        long milesToMoon = 5000000l;

        System.out.println("  milesToSun" + milesToMoon);

        //---------Floating point--------
        // you must add f or F at the end of the number to indicate that this is the float data type
        // upper case or lower case is does not matter, but it's mandatory!

        float priceOfBanana = 1.99f;
        float iPadSize1 = 12.9F;
        double bankBalance = 3000 ;
        System.out.println ( bankBalance ) ;

        double priceOfPotatoes = 3.99 ;
        System.out.println("   price of Banana" + priceOfPotatoes);


        // ----- larger floating point numbers-----
        double priceOfIPad1 = 355.99D;
        double priceOfIPadPro = 1024.99D;
        // compiler automatically assumes it's a double so it's not required to have D at the end
        //however, for a good programming habit, add them always
        double priceOfMac = 2299.99;
        // If you have a whole number by itself, compiler automatically assume it is an int
        //if you have a fractional number by itsel, compiler automatically assume it's an double

        System.out.println("    priceOfIpad1" + priceOfIPadPro);

        //be careful, bear should not ingest large fluffy dog
        //boolean, char
        //byte, short, int, long, float,double
        char myFavoriteCharacter = 'A' ;
        char myFavoriteCharacter2 = 65 ;

        //both of them will get as a result a letter A beause data type is char for both of them

        System.out.println(myFavoriteCharacter);
        System.out.println(myFavoriteCharacter2);

        String todaysTopic =" Arithmetic operator and Scanner , class duration is 3 hours" ;
        System.out. println("Topic and duration : \n " + todaysTopic) ;

        char myNine ='9' ;
       //char cannot have more than one character and this will not work char MyNine= '99' ;



    }
}