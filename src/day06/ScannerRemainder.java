package day06;
import java.util.Scanner;

public class ScannerRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int minutes  = scan.nextInt();
        int hourPart = minutes/ 60 ;
        int minsPart = minutes % 60;
        System.out.println("the minutes" + minutes +" is"+ hourPart + "hours and " + "minsPart" + " minutes");




    }
}
