package day21;

public class SearchingSomethingInString_2 {
    public static void main(String[] args) {
        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex =charCount -1;
        System.out.println("lastCharIndex  = " + lastCharIndex );

        System.out.println("---2 chars ---");
        for (int x = 0; x <= lastCharIndex - 2; x++) {
            //for (int x = 0; x < charCount-2 ; x++) {

            String current2Chars = myName.substring(x, x + 3);
            if(current2Chars.equalsIgnoreCase("an") ) {
                System.out.println("The index of an is " + x);


                //Find out index of all the letters "an" in cases insensitive manner
                //I will go through each and every letter of the String -->> for loop
                //-->> each character I can use a substring(0,2) and so on
                //-->> going to 0 to last index -->> for loop
                //while I am going through each and every 2 characters
                //1. I will check weather current character I am looking at
                //2. equals to  "a" or "A" -->> currentCharacter.equalsIgnoreCase("an");
                //3. if it  is -I will print the index println (the variable you use to keep the index)
                //if not- just move on
                //4. perform an action until I reach one character before last character
                // -->if I go over last character index and I will stop
                //5.

            }   }

    }
}
