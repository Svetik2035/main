package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        //print out the numbers from 1-100 can be divided by 15 without a remainder
        int counter = 0 ;
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
               // System.out.print(i+ " ");
                //counter = counter + 1; or
                //counter += 1;or
                ++counter ;
            }
            }
        System.out.println("counter = " + counter);
        // given a String with a value
        //found out how many letters "a" showed up in this String
        String name = "Esra Fidan";

       // System.out.println( name.charAt(0) == 'a' );
        int countOfA = 0 ;

        for (int x = 0; x < name.length() ; x++) {
            //System.out.println( name.charAt (x) );
            if(  name.charAt(x) == 'a' ){
                System.out.println("BingoFound It!!");
               ++ countOfA;
            }

        }

        }

    }