package ReplItHomeWork;
import java.util.Scanner;
public class Exercise_57 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dayNumber;
        String dayOfTheWeek = "";
        System.out.println("Enter number:");
        dayNumber = scan.nextInt();


        switch (dayNumber) {
            case 1:
                dayOfTheWeek = "Monday";
            break;
            case 2:
                dayOfTheWeek = "Tuesday";
            break;
            case 3:
                dayOfTheWeek = "Wednesday";
            break;
            case 4:
                dayOfTheWeek = "Thursday";
            break;
            case 5:
                dayOfTheWeek = "Friday";
            break;
            case 6:
                dayOfTheWeek = "Saturday";
            break;
            case 7:
                dayOfTheWeek = "Sunday";
            break;

        }

        System.out.println(dayOfTheWeek);
    }
}
