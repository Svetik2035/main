package Day57.Exception;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("BEFORE TRY CATCH:");
        try{//
            System.out.println("In try block");
        int result = 10 / 0;
            System.out.println("After 10/0");
        }catch(ArithmeticException e){
            System.out.println("Exception happened, and it was caught and handled");
        }
        System.out.println("AFTER TRY CATCH");
        try{
            System.out.println("In second try block");
            String str = "java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch(Exception e){
            System.out.println("Exception happened after Try Block and handled!");
        }
           System.out.println("AFTER 2nd TRY CATCH");
    }
}
