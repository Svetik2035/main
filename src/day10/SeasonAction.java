package day10;

public class SeasonAction {
    public static void main(String[] args) {

        /*what do you do in each season

        Spring -->> hike, Easter, Nawruz, Blossom
        Summer-->> Swim, Vacation, barbecue, Holiday
        Fall-->> Black Friday, hiking, Harvest, Halloween, Shopping
        Winter-->> Snowboarding, Ski, Christmas, New Year
         */
        String season = "Spring" ;

        switch(season) {
            //byte,short, char, String
            case "Spring":
                System.out.println("Hike, Easter, Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, barbecue, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding, Ski, Christmas, New Year");
                break;
            default:
                System.out.println("YOU HAVE SELECTED UNKNOWN SEASON!!!");

                break;
        }

        System.out.println("Your season is " + season);
        }
    }

