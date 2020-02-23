package Day36;

public class WrapperReview{
    public static void main(String[] args) {
      //  Long.parseLong("123");//--> 123 Input a word new
        //three ways to create Integer Object:

        Integer i1 = new Integer(1000000000);// old way, do not use it

        Integer i2 = Integer.valueOf(123);
        //is i3 primitive type?
        //or is i3 reference type variable?
        //Auto boxing : primitive to wrapper type conversion
        Integer i3 = 45;//--> 45---> ne Integer(45) ;

        int i4 = 54;

        int i5 = new Integer(100); // new Integer(100) --> 100

        //Auto boxing and unboxing are unique features
        // of conversion b/n Primitive  value into Wrapper Class Objects
        // It happens automatically

        //ArrayList stores an object


    }
}
