package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.next();
        int start = html.indexOf("id");//найти id
        int end = html.lastIndexOf("\"");//найти кавычки

        if (html.contains("html")) {
            System.out.println(html.substring(start+4, end));
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
