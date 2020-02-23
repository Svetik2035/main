package day11;

public class StringEqualityPractice_Condition {
    public static void main(String[] args) {
        /* create a variable called myStr and assign a value
        create a program to check weather myStr is Java
         if true -->> CORRECT WORD!!!!
         if false -->> SAY JAVA!!!!
        */
        String myStr ="Cava";

        if (myStr.equals ("Java") ) {
            System.out.println(" CORRECT WORD!!!!");
        }else if (myStr.equals("Cava") ) {
            System.out.println("Pumpkin");
        } else{
            System.out.println("SAY NOT JAVA NOR PUMKIN!!!!");
        }


    }
}
