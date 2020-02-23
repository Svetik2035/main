package Day36;

public class MethodPractice {
    public static void main(String[] args) {

        // as long we see one number Boolean will be true

      Boolean result1 =checkIfStringHasNumber("ytz12ck");
        System.out.println("result1 = " + result1);
        // Boolean b =true ;
        Boolean result2 =checkIfStringHasNumber("ABCD");
        System.out.println("result2 = " + result2);


        System.out.println( checkIfStringHasNumber( " a as j35   ")  );


    }
    /**write a static method to accept a String and return Boolean(Yes Uppercase) .
     it should return true if the String contains at least one number.
     * @param str
     * @ return true if String contains at least one number
     */
    public static Boolean checkIfStringHasNumber(String str){
        for (int i = 0; i < str.length() ; i++) {

            char eachChar = str.charAt(i) ;
            if( Character.isDigit(eachChar)) {
                return Boolean.valueOf(true);
            }

        }
        System.out.println("No Number found!!!!!");
        return Boolean.valueOf(false) ;
    }
}
