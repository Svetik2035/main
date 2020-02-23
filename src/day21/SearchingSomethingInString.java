package day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {
        String myName = "Svetlana Gorokhova";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex =charCount -1;
        System.out.println("lastCharIndex  = " + lastCharIndex );

        //Find out index of all the letters "a" in cases insensitive manner
        //I will go through each and every letter of the String -->> for loop
        //-->> each character I can use a substring(0,1) and so on
        //-->> going to 0 to last index -->> for loop
        //while I am going through each and every character
        //1. I will check weather current character I am looking at
        //2. equals to  "a" or "A" -->> currentCharacter.equalsIgnoreCase("a");
        //3. if it  is -I will print the index println (the variable you use to keep the index)
        //if not- just move on
        //4. perform an action until I reach last character -->if I go over last character index and I will stop

        System.out.println("----1char------");
        //for (int x = 0; x < charCount; x++) {
        for (int x = 0; x <= lastCharIndex; x++) {
            String currentChar = myName.substring(x, x+ 1);
           if(currentChar.equalsIgnoreCase("a") ){
               System.out.println("The index of a or A is " +  x);

        }

        }

    }
}
