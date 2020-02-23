package office_hour;

import java.util.Arrays;

public class Practice_12_10 {
    public static void main(String[] args) {
        String [ ]cars ={"bmw" , "wv" , "audi" };
        //                0        1      2

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // for each loop - it makes easier to create a code
        // the left side of the loop temporary variable :  right side array  name
        for( String carModel : cars   ){
            System.out.println("I am done assigning the car " + carModel);
                    }
        /**
         * 1.String carModel : cars
         * 2. carModel = "bmw";
         * System.out.println("I am done assigning the car " + carModel);
         * 3.carModel = "wv" ;
         * System.out.println("I am done assigning the car " + carModel);
         * 4. carModel = "audi" ;
         * System.out.println("I am done assigning the car " + carModel);
         *  these three(2,3,4) above equal to
         */
        // for car index:
        for( int carsIndex = 0; carsIndex <= 2; carsIndex ++){
            System.out.println("here is car index: " + cars [carsIndex]);
        }//           0   1  2  3  4
        int[] ages= {23, 43, 5, 7, 87};
        System.out.println(ages[2]);

        System.out.println(ages[3] - ages[2]); //2
        //                    7    -  5      = 2
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        for (int ageOfStudent : ages) {
            System.out.println("this student's age is: " + ageOfStudent);
            System.out.println("I am done");

        }
        System.out.println(Arrays.toString(ages));
        System.out.println("Hi, Asya!");

        /**
         * int ageOfStudent = 23
         * System.out.println("this student's age is: " + ageOfStudent);
         * System.out.println("I am done");
         * int ageOfStudent = 43
         * System.out.println("this student's age is: " + ageOfStudent);
         * System.out.println("I am done");
         * int ageOfStudent = 5
         * System.out.println("this student's age is: " + ageOfStudent);
         * System.out.println("I am done");
         * int ageOfStudent = 7
         *System.out.println("this student's age is: " + ageOfStudent);
         * System.out.println("I am done");
         *
         * int ageOfStudent = 87
         * System.out.println("this student's age is: " + ageOfStudent);
         * System.out.println("I am done");
         */





  }
}
