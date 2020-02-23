package Day36;

public class WrapperWithZWrapperTypes {
    public static void main(String[] args) {
        //i1 is a variable with data type Integer
       // and it can store Integer object
        //what is a deal here with 12?--> Auto-boxing

        Integer i1 = 12;
        Integer i2 = 20;

        sumAndPrint( i1, i2);

        sumAndPrint(23, 10);

        //It's expected 2 Integer objects and it can store Integer Object


        sumAndPrint( new Integer(23), new Integer(10));

        sumAndPrint(Integer.valueOf(23), Integer.valueOf(10));

        // this is explanation for an above method, Java does it for me automatically
        System.out.println("---------------------Method With Parameter ----------------");
        printTheDoubledValue(10);


    }
    /**
     * This method add 2 Integer numbers and print
     * parameter num1 type Integer, first number to add
     * parameter num2 type Integer, second number to add
     */
    public static void sumAndPrint(Integer num1,  Integer num2){
        // we cannot add to object
        // what happening here is:
        // the moment the + operator appeared,
        //compiler will turn num1 and num2 into int so it can add them numerically
        //Integer to int conversion --> auto-boxing


        System.out.println( num1 + num2);

    }

    /**
     * * @param x
     */
    public static void printTheDoubledValue ( int x ){
        System.out.println("after doubling x = " + (x*2));
    }
}
