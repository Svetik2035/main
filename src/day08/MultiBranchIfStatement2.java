package day08;

public class MultiBranchIfStatement2 {

    public static void main(String[] args) {

     /*pseudo code
        given your currentSpeed, speedLimit
        check weather the current speed is
        more than 90-->> jail
        more than 80 and less than 90-->> reckless driving
                ----------------------------------------------------
        more than 70 and less than 80-->> point taken
        more than 60 and less than 70-->> warning
        if not speeding keep driving

        45, 65, 90 bad idea, CONDITION SHOULD BE ALWAYS STARTED FROM THE TOP TO THE BOTTOM
          */

        /*if (currentSpeed > 60 ) {
            System.out.println("You are speeding more than 70--POINTS TAKEN !!!!");
            //asking weather it's less than or equal 70 and more than 60
            //when you come to this point, your speed is already not more than 70
        } else if ( currentSpeed > 70) {
            System.out.println("Your speed is less than or equal 70 more than 60");
        } else {
            System.out.println("Keep Driving, You are good!!!");
        }

         */
        int currentSpeed = 60;
        if (currentSpeed > 80) {
            System.out.println("JAIL TIME");
        }else if (currentSpeed > 90) {
            System.out.println("reckless driving");
        }else if (currentSpeed > 80) {
            System.out.println("point taken");
        }else if (currentSpeed > 70) {
            System.out.println("warning");
        }else if (currentSpeed > 60) {

        }else {
            System.out.println("Keep Driving, You are good!!!");
        }

    }

}
