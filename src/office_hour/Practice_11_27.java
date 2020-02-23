package office_hour;

public class Practice_11_27 {
    public static void main(String[] args) {
         String message = "   I Love JAVA!!!       ";
         //trim --> take out spaces at beginning and ending of a String object
        //IT DOES NOT TAKE OUT THE SPACE IN BETWEEN CHARACTERS

        System.out.println("message = <" + message + ">");

        String messageTrimmed = message.trim();

        System.out.println("message = <" + messageTrimmed + ">");
        //isEmpty -->> check weather a string object is empty, meaning there is nothing inside
        //isEmpty -->>yourString.length() == 0-->>true

        String emptySpaces= "             ";
        System.out.println("emptySpaces = <" +  emptySpaces + ">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is : " + emptySpacesAfterTrimmed.length()  );
        System.out.println("emptySpacesAfterTrimmed is empty??? : " + emptySpacesAfterTrimmed.isEmpty()  );

        //isEmpty VS isBlank method from String class
        //isEmpty -->> if yourString.length()>0 true else it's false
        //isBlank-->> if you have only white space- you get true; else- you get false
        System.out.println("emptySpaces is blank or not ??  "+ emptySpaces.isBlank());

        //indexOf-->> gives you a location of the String you are looking inside anotherString
        // for example: yourString.indexOf("abc)
        //copied from above so we can se what we have -->>String message = "   I Love JAVA!!!  ";

        int locationOfLove = message.indexOf("LOVE");
        System.out.println("location Of word Love = " + locationOfLove);

        //lastIndex of-->> gives you last location of the string you are looking for inside anotherString
        int lastIndexOfLetterA = message.lastIndexOf("A");
        System.out.println("lastIndexOfLetterA = " + lastIndexOfLetterA );






    }
}
