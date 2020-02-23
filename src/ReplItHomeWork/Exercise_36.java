package ReplItHomeWork;
import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {
        int seniorCitizens, nonSeniorCitizens, age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int count = scan.nextInt();
        int count2 = scan.nextInt();

        System.out.println("What is new citizen's age?");
        age= scan.nextInt();

        if(age>= 65) {
            System.out.println("SeniorCitizen");
            count += 1;
            System.out.println("New seniorCitizens " +"count " + count);
            System.out.println("New nonSeniorCitizens " + "count " +count2);
        }else if(age<65) {
            count2= count2 +1;
            System.out.println("Non-Senior Citizen");
            System.out.println("New seniorCitizens " +"count " + count);
            System.out.println("New nonSeniorCitizens " + "count " +count2);
        }



        //-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.
        //
        //-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.
        //
        //-At last, print another message:
        //"New seniorCitizens count ValueOfVariable"
        //"New nonSeniorCitizens count ValueOfVariable"
        //
        //Example Run:
        //
        //Enter current count for seniorCitizens and nonSeniorCitizens:
        //5
        //4
        //What is new citizen's age?
        //66
        //Senior Citizen
        //New seniorCitizens count 6
        //New nonSeniorCitizens count 4

    }
}
