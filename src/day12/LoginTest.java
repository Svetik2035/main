package day12;

public class LoginTest {
    public static void main(String[] args) {
        /* TASK 4
        String str = "abc" ;
        str.equals("abc") —> true       ! str.equals("abc") —>> false
        Create class called LoginTest with main method
                Create 2 String variable called userName , password
        and do following
        // your correct username password is  user123  and pass123
        Check if your username and password correct
        If so print login successful
        If not
        Check whether your username correct
        if not print  , username is not correct
        Check your password is correct or not
        If not print password is not correct*/

        String userName = "user123";
        String password = "pass123";
        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login is successful");
        }else if (!userName.equals("user123") && password.equals("pass123")){
            System.out.println("Your userName is not correct");
        }else if (userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Your password is not correct");
        }else{
            System.out.println("USER NAME AND PASSWORD ARE BOTH WRONG!!!");
        }

    }
}
