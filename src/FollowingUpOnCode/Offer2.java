package FollowingUpOnCode;

public class Offer2 {
    String location;
    String company;
    long salary;
    boolean isFullTime;

    public void displayOfferDetails (){
        System.out.println("Location = " + location + " | "+
        "Company = " + company + " | "+ "salary = $ " + salary + " | "+
                "Is full time = " + isFullTime);
    }
    public void turnToFullTime(){
        if(isFullTime == false){
            isFullTime =true ;

        }else{
            System.out.println("You Are AlreadyFull Time!!!!");
        }
    }


}
