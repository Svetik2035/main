package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {

        String name = "Muge";

        //check if String starts with another String
        System.out.println(name.startsWith("Mu") );

        System.out.println(name.startsWith("mu") );
        //Java IS CASE SENSITIVE and said it is false

        System.out.println(name.startsWith("Mac") );

        //check if a string ends with another String

        System.out.println( name.endsWith("e") );
        System.out.println( name.endsWith("G") );// wrong letter and case
        System.out.println( name.endsWith("E") );// wrong case, java is case sensitive
    }
}
