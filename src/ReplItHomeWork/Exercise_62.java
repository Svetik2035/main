package ReplItHomeWork;
import java.util.Scanner;
public class Exercise_62 {
    public static void main(String[] args) {
        String text ="java";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        text = scan.next();
        text.length();
        System.out.println("Length is:" + text.length());

        /*Example:
         Display message: "Please enter the text:"
          input: java
         Display message: "Length is: 4"*/
    }

}
