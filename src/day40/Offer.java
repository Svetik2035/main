package day40;

public class Offer {
    String location;
    String company;
    long salary;
    boolean isFullTime;

    /*This is instance method to print all the information about Offer object
     * Inside of instance method  we can directly access variable
     */

    public void displayInformation(){
        System.out.println("Location = "+ location +  " | "+
                "Company = " + company + " | " +
                "Salary = " + "$ "+ salary + " | " +
                "isFullTime = " + isFullTime);

    }
    //Write a method called turnToFullTime
    public void turnToFullTime(){
        if(isFullTime == false){
            isFullTime =true ;
        }else{
            System.out.println("Already full time!" );
        }

    }
    // Write  a method to change the location of the offer
    // to the location user passed
    public void changeLocation(String newLocation){
        location = newLocation;
        // when change a new location-when we call the method

    }
    // Write a method to accept 4 parameters to change all info
    // about offers
    // two different methods do not see each other, they are absolutely separate
    public void changeAllInfo(String newCompany, String newLocation, long newSalary,  boolean newIsFullTime){
        // we ar assigning new values inside the method:
        company = newCompany;
        location =newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        //an instance method you can call another instance method
        //an instance method you can use any instance fields
        //since we already have functionality to display information
        //we called it here to display new information after modifying
        displayInformation();
    }
    //write a method to check the offer belongs to 100K club
    // this a return type
    public boolean is100KOffer(){//()showing method
        return salary>=100000;//salary>=100000;already generated a boolean result
        // so we can directly return that result

    }
    /**
     * Create an instance method called toString
     * does not have a parameter
     * @return String representation
     * add square brackets
     * In below format:Location = Atlanta | Company = Amazon | Salary = $ 150000 | isFullTime = true
     */
    public String toString(){
       String str = "[Location = "+ location +  " | "+
                "Company = " + company + " | " +
                "Salary = " + "$ "+ salary + " | " +
                "isFullTime = " + isFullTime+ "]";
       return str;
    }

}
//Create Offer class with
//instance fields :
//location, company, salary , isFullTime
//instance methods :
//displayOfferDetails -- print all info about offers
//Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
//Optionally : @channel
//Store them into List<Offer> then call the method.
//Optionally :
//Add 5000 to each offers less than 100K