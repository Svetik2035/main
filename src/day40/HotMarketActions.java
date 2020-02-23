package day40;

import java.util.ArrayList;

public class HotMarketActions {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Baltimore";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.company = "Google";
        o2.location = "Boston";
        o2.isFullTime = true;
        o2.salary = 100000;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();

        Offer o4 = new Offer();
        /**
         * if we do not have assigned the values, for instance, field/ variable
         * we get default value
         * for primitives : 0 or 0.00
         * for boolean : false
         * for char: ' '
         * for any reference types: null
         */
        o4.displayInformation();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println("myOffers ===============For each loop===================== ");

        for(Offer each : myOffers){
            each.displayInformation();
        }
        System.out.println("myOffers============for Loop==================");
        for (int x = 0; x < myOffers.size(); x++) {
            //store each item to a variable each
            Offer each = myOffers.get(x);
            each.displayInformation();
            /**
             * this is one shot version:
             * myOffers.get(x).displayInformation();
             */

        }

    }

}
