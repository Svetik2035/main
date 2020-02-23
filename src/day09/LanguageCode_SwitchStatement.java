package day09;

public class LanguageCode_SwitchStatement {
    public static void main(String[] args) {

        int languageOption=5;

        String greeting ="";

        switch (languageOption) {

            case 1 :
                greeting="Hello";
                break; //use it to get out of this branch
            case 2 :
                greeting ="Salam";
                break;
            case 3:
                greeting ="Hola";
                break; //use it to get out of this branch
            case 4 :
                greeting ="Privet";
                break;
            case 5 :
                greeting ="Merhaba";
                break;
            case 6:
                greeting ="Szia";
                break;
            case 7 :
                greeting ="BonJour";
                break;
            default:
                greeting ="Unknown";

        }
        System.out.println("This is how the greeting message you get : " + greeting);

    }
}
