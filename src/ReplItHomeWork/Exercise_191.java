package ReplItHomeWork;

public class Exercise_191 {
   public static String reverse(String input) {
       String reverse = "";

       for (int i = input.length() - 1; i >= 0; i--) {
           reverse = reverse + input.charAt(i);
       }

       return reverse;
   }

}

            /*Instructions from your teacher:
        reverse method reverse a string.
        it gets a string and returns it in reverse.
                for example:
                reverse("foo") ==> "oof"
                reverse("student") ==> "tnedust"     */


