package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        String message = "   REPL IS COMING !";

        System.out.println(message);
        System.out.println("message character count is "+ message.length());

       //System.out.println(  message.trim()  );// this will not work, we need to reassign the variable
        message =message.trim();
        System.out.println(message);

        System.out.println("message character count is "+ message.length());
        //trim method is used to take spaces on the sides, NOT in between
        System.out.println( message.isEmpty());

    }
}
