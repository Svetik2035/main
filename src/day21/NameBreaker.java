package day21;

public class NameBreaker {
    public static void main(String[] args) {
   //                    012345678
        String myName = "Nursultan";

        //get out when  you see letter l from the loop

       /* int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex =charCount -1;
        System.out.println("lastCharIndex  = " + lastCharIndex );*/

        for (int x = 0; x <= myName.length(); x++) {
           // String currentChar = myName.substring(x, x+ 1);
            char currentChar = myName.charAt(x) ;
            if(currentChar == 'l')  {
                System.out.println("Found It !!!");
                break;

                }
            System.out.println( currentChar);

        }
        for (int x = 0; x <= myName.length(); x++) {
            String currentChar = myName.substring(x, x+ 1);
            if (currentChar.equalsIgnoreCase("l")) {// I can use myName.substring (x, x+1) instead of currentChar
                System.out.println("Found It !!!");          //   (myName.substring (x, x+1).equalsIgnoreCase("l"))
                break;

            }
            System.out.println( myName.substring (x, x+1));
        }

        for (int x = 0; x < myName.length(); x++) {

            char currentChar = myName.charAt(x);


            if (currentChar == 'l' || currentChar == 'L') {
                System.out.println("FOUND IT !!!!!");
                break;
            }

            System.out.println(currentChar);
        }
        }
}
