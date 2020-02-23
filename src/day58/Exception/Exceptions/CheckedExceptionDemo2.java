package day58.Exception.Exceptions;

public class CheckedExceptionDemo2 {
    public static void main(String[] args) throws Exception{
        System.out.println("Checked Exception in next line");

        Thread.sleep(1000);


        System.out.println("After Thread.sleep");
    }// this is declaring Exception


}
