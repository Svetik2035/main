package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {
        double [] prices = new double[5];
        System.out.println( prices[0]);

        /**
         * we Cannot Print out array variable directly
         * to see what is inside
         * */
        //System.out.println(prices);

        prices [0] = 2.46 ;
        prices [1] = 12.96 ;
        prices [2] = 992.1 ;
        prices [3] = 500 ;// we can store int into double and called casting
        prices [4] = 65.123;
        //what will happened if I will go over the range
        //RUN TIME ERROR!!!
        //prices [5] = 165.3;
        //System.out.println(prices[0]+"\n"+prices[1]+"\n"+prices[2]+"\n"+prices[3]+"\n"+prices[4]);
        // this will give us a sum of all the values

        /**
         * Create a char array that holds all the letters from your first name
         * and assign each character of your first name
         * then print out each
         */
        char [] name = new char[8];

        name [0] = 83 ;
        name [1] = 118 ;
        name [2] = 101 ;
        name [3] = 116 ;
        name [4] = 108 ;
        name [5] = 97 ;
        name [6] = 110 ;
        name [7] = 97 ;

        System.out.println(  name[0]);
        System.out.println(  name[1]);
        System.out.println( name[2]);
        System.out.println(  name[3]);
        System.out.println( name[4]);
        System.out.println(  name[5]);
        System.out.println( name[6]);
        System.out.println(  name[7]);

        /**
         * This will actually print the content of a char array no a memory address
         * and this is ONLY for char array, anything else will print memory address
         */
        System.out.println(name);// look at the above

        boolean [] yesNo = new boolean[3];

        System.out.println(  yesNo[0]);
        System.out.println(  yesNo[1]);
        System.out.println( yesNo[2]);

        yesNo [0] = true ;
        yesNo [1] = false ;
        yesNo [2] = 10>7;// boolean can store a boolean value by comparing a statement if it is a true of false statement

        System.out.println(  yesNo[0]);
        System.out.println(  yesNo[1]);
        System.out.println( yesNo[2]);


    }
}
