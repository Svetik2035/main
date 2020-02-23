package day31;

public class SeasonChecker {
    public static void main(String[] args) {
        // declared and assigned value inside main method
        //it can be accessible in the main method
        String mySeason ="AAAA";
        decideSeasonAction("Winter");
        decideSeasonAction("Summer");
        System.out.println(mySeason);


    }
    public static void decideSeasonAction(String season){
        // this season method parameter can be only be accessible inside method body
        switch(season){
            case"Spring" :
                System.out.println("Hiking");
                break;
            case"Summer" :
                System.out.println("Swimming");
                break;
            case"Fall" :
                System.out.println("Hiking");
                break;
            case"Winter" :
                System.out.println("Hiking");
                break;
            default:
                System.out.println("Invalid Season");
        }
    }
}
