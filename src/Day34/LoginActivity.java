package Day34;

public class LoginActivity {
    public static void main(String[] args) {
        Login1("user","abc123");
        login2("Sveta", "bca123");
    }
    /*1, login1 :  static void method
	it has two String method parameters
			called username and password
	(it accept 2 String object as argument when being called)
	it check weather username and password  "user" and "abc123"
	if yes
		print login successful
	else
		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)*/
    public static void Login1(String username , String password){
        if(username.equals("user") && password.equals("abc123")){
            System.out.println("login successful");
        }else{
            System.out.println("login failed");
        }
        /*2, login2 :  static method boolean return type
	it has two String method parameters
			called username and password
	(it accept 2 String object as argument when being called)
	it check weather username and password  "user" and "abc123"
	if yes
		return true
	else
		return false */


    }
     public static boolean login2(String username , String password) {
         if (username.equals("user") && password.equals("abc123")) {
             System.out.println(true);
         } else {
             System.out.println(false);


         }
         return false;
     }


}
