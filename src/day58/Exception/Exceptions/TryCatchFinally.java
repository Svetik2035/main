package day58.Exception.Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try{
            System.out.println("Hello from my try block");
            String str = null;
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println("Exception happened and caught");
        }finally {
            System.out.println("finally block. runs if there Exception, or no exception");


        }
    }
}
