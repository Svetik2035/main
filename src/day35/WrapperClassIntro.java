package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int x = 10 ;

        // primitive data types are pure value has no attribute or behaviour
        // each primitive type has wrapper class that turns it into object so we can treat it as

        Integer xObj1 = new Integer (12);// do not use this method for Integer

        // valueOf method of Integer class
        // return an integer object by wrapping up the value you passed
        // it has2 overloaded versions one - that accepts int , another- accepts String
        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        byte bValue = xObj2.byteValue();// we convert the object into byte value to print out
        System.out.println("byte value =" + bValue);
        
    }
}
