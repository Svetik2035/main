package day15;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {
       /* String aName = "Arya";

        char c1 =  aName.charAt(3);
        char c2 =  aName.charAt(2);
        char c3 =  aName.charAt(1);
        char c4 =  aName.charAt(0);

        System.out.println(c1 +" " + c2 + " "+ c3 +" " + c4);*/
        String name = "Arya Stark";
        System.out.println(" name.contains st  RESULT IS : " + name.contains ( "st")   );

        // want to check weather this name contains st no matter the case
        //so i want t o store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase();// Arya Stark
        System.out.println("uppercaseName contains ST or not ? " + uppercaseName.contains("ST"));

        String lowercaseName = name.toLowerCase();// Arya Stark
        System.out.println("lowercaseName contains st or not ? " + lowercaseName.contains("st"));

        // or we can do at once
        //this is called method chaining, combining multiple method call
        //make my name all lowercase (String) then check weather it contains lower lower case st

        System.out.println( name.toLowerCase().contains("st"));//THIS WORK BECAUSE result in another String Object

        //System.out.println( name.length().toUpperCase());-->>bad idea,
        // primitives have pure value, and class has action(functionality






    }

}
