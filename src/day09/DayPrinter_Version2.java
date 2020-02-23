package day09;

public class DayPrinter_Version2 {
    public static void main(String[] args) {

         /* Create a variable called dayCode as int
        if the daycode is 1-->>Monday
        if the daycode is 2-->>Tuesday
        if the daycode is 3-->>Wednesday
        if the daycode is 4-->>Thursday
        if the daycode is 5-->>Friday
        if the daycode is 6-->>Saturday
        if the daycode is 7-->>Sunday

        Second way to do it!!!
         */
        int dayCode = 7;

        String dayName;
        //String dayName = ""; //assigning an empty String value
        //String dayName;

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
            System.out.println("Yeah@@ Saturday@@!!!");
        } else if (dayCode == 7) {
            dayName = "Sunday";
            System.out.println("GO WATCH fOOTBALL!!!");
        } else {
            dayName = "UNKNOWN!!!";
        }
        System.out.println("Day is " + dayName);

    }
}
