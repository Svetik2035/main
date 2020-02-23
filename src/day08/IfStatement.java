package day08;

public class IfStatement {
    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 60 ;

        /* if the yourCurrentSpeed is more than speed limit
        get pulled over by the police
        given a ticket by the police
        taken away some points on your license
        go to court

       if not over the limit
       go shopping!!

       outside if statement, say the end
         */
        boolean IamSpeeding = ( yourCurrentSpeed > speedLimit ); // parenthesis are optional
        // your current speed is 75 and 60 is a limit, than boolean is true
        /* in parentheses you can only put:
        boolean value: true or false
        boolean variable
        any expressions that return boolean value
         */
        if ( IamSpeeding ) {
            System.out.println("get pulled over by the police");
            System.out.println("given a ticket by the police");
            System.out.println("taken away some points by the police");
            System.out.println("go to court");
        } else { //there is where we ending
            System.out.println("go shopping");
            System.out.println("Buy IceCream!");
            System.out.println("Enjoy your day!!!");
        } //do not forget to close with the curly braces
        /* if (IamSpeeding) {
        if (true) {
         */
        System.out.println("THE END");
    }
}
