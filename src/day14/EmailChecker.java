package day14;

public class  EmailChecker {
    public static void main(String[] args) {




        String email = "abc@gmail.com";
    if( !email.contains ("@") ||email.contains (" ") ) {
        System.out.println("invalid email");
    }else if( email.endsWith("@gmail.com") ) {
        System.out.println("Google Mail");

    }else if( email.endsWith("@yahoo.com") ) {
            System.out.println("Yahoo Mail");
    }else if( email.endsWith("@mail.ru") ) {
            System.out.println("Russian Mail");
        }



    }
}
