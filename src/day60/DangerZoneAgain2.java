package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain2 {


    public static void main(String[] args) throws InterruptedException {
        readMyFile();
        System.out.println("THE START");
        Thread.sleep(3000);
        System.out.println("The end ");

    }
    // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException from java.util package
    //public static void readMyFile(){// we use static to call this method

    public static void readMyFile() {

        System.out.println("Reading the file in my computer");
        try {
            //we are throwing  the checked exception
            //so It Must be handled or declared
            // that we chose to handle it with try catch statement
            throw new FileNotFoundException("Kaboom ! file is not here!!! ");
        }catch(FileNotFoundException e){
            System.out.println("AHA!!! Caught you in readMyFile!!!!");
        }

    }

//public static void readMyFile(){// we use static to call this method
}