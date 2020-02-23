package ReplItHomeWork;
import java.util.Scanner;
public class Exercise_78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        int dotLocation = message.indexOf(".");
        int curlyBracesLocation = message.indexOf("}");

        String sender = message.substring(8,dotLocation-1);
        String phoneNumber = message.substring((dotLocation+15),(dotLocation+27));
        String messageBody = message.substring(dotLocation+39,curlyBracesLocation);
        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);

       /* Instructions from your teacher:
        We have a message variable already declared and assigned value in this format

        Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

        Variables are already declared:

        sender, phoneNumber, messageBody
                - by using String methods:
        retrieve related information from SMSmessage string and assign to those 3 variables.
                -print each variable in separate line

        Sender: Mike Smith
        Phone Number: 202-123-3456
        Message body: I love programing and problem solving*/


       /* String sender = "";

        String phoneNumber= "";

        String messageBody= "";

        message="Sender: "+ sender.concat("")+"\n"+ "Phone Number: "
                + phoneNumber.concat("[]")+"\n"+ "Message body: "+ messageBody.concat("{}");
        System.out.println(message);*/



    }
}
