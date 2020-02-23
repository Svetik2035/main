package day15;

public class ReversingAString {
    public static void main(String[] args) {
        String name ="Akbar";

        System.out.println(name.charAt(0) + " "+name.charAt(1) + " "+name.charAt(2) + " "+name.charAt(3) + " "
                + name.charAt(4));

        System.out.println(name.charAt(4) + " "+name.charAt(3) + " "+name.charAt(2) + " "+name.charAt(1) + " "
                + name.charAt(0));

        //this will be on interview!!!

        //how do you  find out last character of any String

        //counting character start with one
        //counting Index (location) starts with  0
        // so last character index/location will be always one less than actual character count



        int characterCount = name.length();
        int lastCharIndex = characterCount -1;// index starts from 0, that is
        char lastChar =  name.charAt(lastCharIndex);
        System.out.println("LAST CHAR IS "+ lastChar);

        System.out.println("Last Char in one shot " + name.charAt( name.length()-1));



    }
}
