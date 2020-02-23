package office_hour;
import java.util.Scanner;
public class Practice_11_20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    //scanner nextX and nextLine
        System.out.println("What is your age ? ");
                int age = scan.nextInt();
       // if you need to make this program run without an issue ,
       //enter age and name is the same line
        scan.nextLine();


        System.out.println("What is your full name ? ");


        String fullName = scan.nextLine();

        System.out.println("Your name is " + fullName + " , your age is " + age);
    }
}
