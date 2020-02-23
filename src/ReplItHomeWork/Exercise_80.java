package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String route = "";

        String directions = "A right B down C left D up A right B down C left D";

        if (start.equals(end)){
            System.out.println(start+ " found");
        }
        else {
            int indexStart = directions.indexOf(start);
            int indexEnd = 0;
            if (start.charAt(0)<end.charAt(0)){
                indexEnd = directions.indexOf(end);
            } else {
                indexEnd = directions.lastIndexOf(end);
            }
            route = directions.substring(indexStart+2,indexEnd-1);
            route = route.replace ("A",">");
            route = route.replace ("B",">");
            route = route.replace ("C",">");
            route = route.replace ("D",">");
            System.out.println(route+": "+end+" found");
        }


    }
}