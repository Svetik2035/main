package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
                     //01234567890123456789012345678901234567890123456789012345678901234567
         String msg = "I struggle with java I like java I love Java Everything is Awesome !";
         // 1. print every other letter
        //2.when you reach letter "a"  break the loop
        //optionally : break when you see 3-rd A in case insensitive manner

        int charCount = msg.length();
        System.out.println("charCount = " + charCount);


        //for (int y = 0; y < charCount-1; y++) {or
        for (int y = 0; y < charCount-1; y++) {

            if (y % 2 == 1) { //(y % 2!= 0)
               continue;
            }
            System.out.println(y +  " : " + msg.substring(y , y+1));

        }
        System.out.println();
        
        //Task 2:
        for (int y = 0; y < charCount-1; y++) {
            String currentChar = msg.substring(y , y+1) ;
            if(currentChar.equalsIgnoreCase("a") ){
                break;
            }
            System.out.println("currentChar = " + currentChar);
        }
        //combine these two tasks together in one shot:

        for (int y = 0; y < charCount-1; y++) {
            //this is the code to skip odd number index letters
            if (y % 2 == 1) { //(y % 2!= 0)
                continue;// this line skips the rest and move to the next iteration

            }
            //this is storing each character as a String
            String currentChar = msg.substring(y, y + 1);
            //this is checking the currentChar is J or j
            if (currentChar.equalsIgnoreCase("j")) {
                break;//this will stop the loop
            }
            System.out.println(y + "index" + " : currentChar = " + currentChar);

        }

    }

}
