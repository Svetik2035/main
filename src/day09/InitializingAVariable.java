package day09;

public class InitializingAVariable {
    public static void main(String[] args) {

        /*int num :
        a variable inside a method , must get an initial value
        before it's being used for the first time
        and there be not be any chance
        this variable does not get value before usage
        System.out.println(num) ;
         */
        /*Language Picker:
        assume you are on the call and you have been given option to be greeted by
        the language of your choice according to the number you provided
        Create a variable called languageOption, String variable called greeting; assign an empty String
        1-->>"Hello"
        2-->> "Salam"
        3-->> "Hola"
        4-->> "Privet"
        5-->> "Merhaba"
        6-->> "Szia"
        7-->> BonJour"

        The problem should set the value of a String variable called greeting
        to this Value: 1-->>"Hello, SDET"
        Print out-->> This is how the greeting message you get:"Hello, SDET"
         */

        int languageOption = 4;

        String greeting = "";


        if ( languageOption== 1) {
            greeting = "Hello" ;
        } else if ( languageOption== 2) {
            greeting= "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet" ;
        } else if ( languageOption== 5) {
            greeting = "Merhaba";
        } else if ( languageOption== 6) {
            greeting ="Szia"  ;
                    } else if ( languageOption== 7) {
            greeting = "BonJour";

        } else {
            greeting = "UNKNOWN!!!";
        }
        greeting = greeting+ " , SDET";
        System.out.println("This is how the geeting message you get : " + greeting);


    }
}
