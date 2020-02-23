package office_hour;

public class Practice_12_02 {
    public static void main(String[] args) {
                    // 012345678901234567890123456
        String item = "Echo Dot (3rd Gen) Charcoal";
        // get whatever is inside parenthesis ()
        //find out index of this (and index of ) , use them for substring to get the text
        //if I know the location than do this:
        System.out.println( item.substring(9,18) );// with ()
        System.out.println( item.substring(10, 17));// without parenthesis
        //if I do not know the location:
        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");

        String wordInsideParenthesis = item.substring(indexOfOpeningParenthesis +1 , indexOfEndingParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);
//-------------------------------------------
        String letters = "J%a^V*$1a";
        //remove % ^ * 1 $
        letters = letters.replace("%", "")//"Ja^V*$1a"
                         .replace("^", "")//"JaV*$1a"
                         .replace("*", "")//"JaV$1a"
                         . replace("1" ,"")//"JaV1a"
                         .replace("$" , "")//"JaVa"
                         .toUpperCase() ;//"JAVA"
        System.out.println("letter = "+ letters);
        //if you want to replace only the first one, use replaceFirst method


    }

}
