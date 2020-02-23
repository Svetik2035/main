package day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "Pumpkin" ;
        System.out.println("str = " + str);

        System.out.println( str.equals("pumpkin") );
        // contains:
        //it checks weather a string exists in another string
        System.out.println("Does it contain Pumpkin : ");
        System.out.println( str.contains("Pumpkin") );

        // if I want to check if string is containing the "Pumpkin" or not use boolean
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin); // short cut to print a variable value in nice format
        //type soutv+tab

        //startsWith ans endsWith methods
        //check weather String starts with another string
        //check weather String ends with another string
        //and return true or false result
        boolean startsWith =str.startsWith("I");
        System.out.println("startsWith = " + startsWith);
        boolean endsWith = str.endsWith("Pumpkin");
        System.out.println("endsWith = " + endsWith);

        // password validator
        // minimum  8 Char (characters) maximum 16 Char
        //It must contain _ or $
        //It must Not Contain space
        //It must start with Ab
        // if any of above conditions are not match say "INVALID PASSWORD"
        //else say "GOOD PASSWORD"
        String password = "ASH2723gfdsu" ;

        // minimum  8 Char (characters) maximum 16 Char
        boolean min8max16 = password.length()>=8 && password.length() <=16 ;
        // password length between 8 and 16 characters

        //It must contain _ or $
        boolean mustContain_or$ = password.contains("_") || password. contains("$");
        // password.contains "_" || password.contains ("$")

        //It must Not Contain space
        // ! password.contains(" ")

        // It must start with Ab
    /*if() {
        System.out.println("INVALID PASSWORD");
    }else{
        System.out.println("GOOD PASSWORD");
    }*/




    }

}
