package day13;

public class StringMethods {
    public static void main(String[] args) {
        /*
        String actions that we already know so far
        1. equals */
        String s1 = "hello" ; //s1 -is remote and "hello" -is TV
        System.out.println( s1.equals("abc"));

        /*2.equalsIgnoreCase
         */
        System.out.println( s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method of the String is used to
        //make String all character uppercase

        System.out.println(  s1  );// it will print  String s1 = "hello" ;
        System.out.println( s1.toUpperCase() ); // it will print all Upper case word ;

        //toLowerCase method of the String is used to
        //make String all character lowercase
        System.out.println( s1.toLowerCase() );

        /*
        store your name into variable
        -print your name in uppercase:
        you may optionally concatenate "MY NAME IS : YOURNAME"
        -print your name in lowercase:
        you may optionally concatenate "my name is : yourname"
         */

        String s2 = "svetlana" ; //s1 -is remote and "hello" -is TV
        System.out.println( s2.equals("abc"));

        System.out.println( s2.equalsIgnoreCase("SVETLANA"));

        System.out.println( s2.toUpperCase() ); // it will print all Upper case word ;

        System.out.println( s2.toLowerCase() );

        //In order to get how many character we have inside String
        //we can use length method of the String
        //it will count each and every
        System.out.println( s1.length()  );
        System.out.println( s2.length() );

        int lengthOfStr = s1.length();

        if (lengthOfStr > 4) {
            System.out.println("More than 4 characters");
        }else{
            System.out.println("NOT MORE THAN 4");
        }



    }
}
