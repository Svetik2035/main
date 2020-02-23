package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        // if you reverse a String if it does not changes
        //it means the String is palindrome
        //level, kayak, elle, madam, aziza

        String name = "kayak" ;

        System.out.println("name = " + name);
        String reversedName= "" ;

        for  (int x = name.length()-1 ; x>=0; x--) {
            reversedName= reversedName + name.charAt(x);

        }
        System.out.println("reversedName = " + reversedName);
        //check weather reverse name is equal without case checking.
        if( name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");

        }else{
            System.out.println("Palindrome test has failed");
        }

         //homework: make this code  that it will not care about spaces
    }
}
