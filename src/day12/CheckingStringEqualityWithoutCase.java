package day12;

public class CheckingStringEqualityWithoutCase{
    public static void main(String[] args) {

        String userName ="abc123" ;

        boolean userNameCorrect =userName.equals("ABC123");
        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase =userName.equalsIgnoreCase("ABC123");
        System.out.println(nameCheckIgnoreCase);
        // store your name is a name variable
        //check for equality

    }
}
