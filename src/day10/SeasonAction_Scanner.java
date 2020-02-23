package day10;
import java.util.Scanner;
public class SeasonAction_Scanner {
    public static void main(String[] args) {
       /*what do you do in each season

        Spring -->> hike, Easter, Nawruz, Blossom
        Summer-->> Swim, Vacation, barbecue, Holiday
        Fall-->> Black Friday, hiking, Harvest, Halloween, Shopping
        Winter-->> Snowboarding, Ski, Christmas, New Year*/
    Scanner scan = new  Scanner(System.in);
        System.out.println("What is the favorite season?");
        String season = scan.next();// yalniz bunu elave edirsen ki cavabi intereaktiv alasan ve import scaner
        switch (season){
            case  "Spring":
                System.out.println("In " + season + " You can Hike, or celebrate Easter, or Nowruz or  Blossom");
                break;
            case "Summer":
                System.out.println("In " + season + " you can go to Vacation, or do BBQ");
                break;
            case "Fall":
                System.out.println("In " + season + " you can do hiking, harvest and celebrate Hallowen");
                break;
            case "Winter":
                System.out.println("In "+season + " you can go snowboarding, ski and celebrate Chrismas");
                break;
            default:
                System.out.println("There is no kind of season");

    }

    }



        }

