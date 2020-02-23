package ReplItHomeWork;

public class Exercise_179 {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String  output = "";
        for (int i = 0; i <str.length() ; i++) {
            if(!output.contains("" + str.charAt(i))){
                output += str.charAt(i);
            }

        }
        return output;
    }
}
