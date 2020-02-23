package day19;

public class ForLoopStairCase {
    public static void main(String[] args) {
        String star = "" ;

        //CAN BE ON an  INTERVIEW!!!!!!!


        /*star = star + "* ";
        System.out.println(star);

        star = star + "* ";
        System.out.println(star);

        star = star + "* ";
        System.out.println(star);

        star = star + "* ";
        System.out.println(star);*/

        for(int i = 1 ; i<= 5; i++) {//int i = 1; -->> stars from 1; i<= 50-->> it will be done 50 times;
            // i++- add one every time
            star = star + "* ";//star+= "* ";
            //System.out.println(star);-->> just to get the star
            System.out.println(i + " " + star);
           // initialization: RUN ONCE
            //condition checking:EACH AND EVERY TIME
            //increment/decrement: after each Iteration (one time run of the loop)
        }

    }
}
