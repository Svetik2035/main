package day58.Exception.Exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Checked Exception in next line");
    try {
        Thread.sleep(1000);
    }catch(InterruptedException e){//or (Exception e){
        System.out.println("Exception was caught");
    }
        System.out.println("After Thread.sleep");
    }// we are handling Exception


}
