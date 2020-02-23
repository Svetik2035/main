package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        //checking for String equality should be always
        //done using equals method of String
        //oneString.equals(anotherString)  -->> true or false
        //just comparing 2 String literal directly using equals method
        //equals method coming from String class
        //each  and every String  object you created will have this functionality
        //System.out.println( "Java".equals("java") );-->> this is something that you will rarely use
        String myStr = "Java";
        System.out.println(myStr.equals("Java"));
        String yourStr = new String("Java");

        System.out.println("is my String same as your String ?");
        //how compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));
        /* create a program to check weather myStr value is Java
         if true -->> CORRECT WORD!!!!
         if false -->> SAY JAVA!!!!
        */
        if (myStr.equals("Java") ) {
            System.out.println("CORRECT WORD!!!!");
        }else{
            System.out.println("SAY JAVA!!!! ");

        }






    }


    }