package InterviewPreparation;

public class ReverseString {
    public static void main(String[] args) {
       StrReverse("ABCD");// this is to see debugging
        System.out.println(StrReverse("ABCD"));// this one just to print te reverse method

    }
        //String -- Reverse
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA
        public static  String StrReverse(String str) {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.toCharArray()[i];

            }
            return reverse;
        }

}

