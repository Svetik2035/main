package day58.Exception.Exceptions;

public class RunTimeErrorMemo {
    static int num =0;

    public static void main(String[] args) {
        num++;
        System.out.println("num = "+ num);
        //call main method again
        main(null);
      /*Stock over flow error will occur
       whenever  method is called in Java, a frame

       */
    }
}
