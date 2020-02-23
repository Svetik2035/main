package FollowingUpOnCode;

public class MarketActions1 {
    public static void main(String[] args) {
        Offer2 s1 = new Offer2();
        s1.company ="Apple";
        s1.location = "Baltimore";
        s1.isFullTime = true ;
        s1.salary = 125000;
        s1.turnToFullTime();
        s1.displayOfferDetails();
        System.out.println("--------Offer 2----------");

        Offer2 s2 = new Offer2();
        s2.company ="Amazon";
        s2.location = "Towson";
        s2.isFullTime = false;
        s2.salary = 137000;
        s2.turnToFullTime();
        s1.turnToFullTime();
        s2.displayOfferDetails();
        System.out.println("--------Offer 3----------");

        Offer2 s3 = new Offer2();
        s3.company ="BCBS";
        s3.location = "Owings Mills";
        s3.isFullTime = true ;
        s3.salary = 150000;
        s1.turnToFullTime();
        s3.displayOfferDetails();

        System.out.println("--------Offer 4----------");

        Offer2 s4 = new Offer2();
        s4.displayOfferDetails();
        s1.turnToFullTime();
        s4.displayOfferDetails();

    }
}
