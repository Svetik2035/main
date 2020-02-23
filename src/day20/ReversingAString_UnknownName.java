package day20;

public class ReversingAString_UnknownName {
    public static void main(String[] args) {
        //given a string variable name with  a value
        // reverse this name and store reversed value(from 7 to 0)into
        //another string variable reversedName
        //   index     01234567
        String name = "Alisa Zakirova" ;
        String reversedName = " ";

        int lastCharIndex = name.length ()-1;


        for (int x = lastCharIndex; x >= 0; x--) {


            reversedName = reversedName + name.charAt( x );;
        }
        System.out.println("reversedName = " + reversedName);

    }
}
