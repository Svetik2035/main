package day22;

public class MultiplicationTable {
    public static void main(String[] args) {
        // think about one and slowly move  to next
        System.out.println("1 x 1 = "+ 1*1 );
        System.out.println("1 x 2 = "+ 1*2 );
        System.out.println("1 x 3 = "+ 1*3 );

        System.out.println("Multiplication table of 1");
        // this loop is for itereting numbers from 1 to 10
        for (int base = 1;base <= 12; base++) {
           // System.out.println("1 x 1 = "+ 1*1 );
            System.out.println("1 x "+ base +" = "+ 1 * base);

        }

        System.out.println("Multiplication table of 2");
        for (int base = 1; base <12 ; base++) {
            System.out.println("2 x " + base + " = "+ 2 * base);

        }
        System.out.println("Multiplication table of 3");
        for (int base = 1; base <12 ; base++) {
            System.out.println("3 x " + base + " = " + 2 * base);
            /**
             * plain english logic
             * write a code to generate multiplication table  of one number
             * then generate multiplication table from 1 to 10
             */

        }
        //this nested loop to generate the code as much times as possible
        for (int timesTable = 1; timesTable <=10 ; timesTable++) {
            System.out.println("timesTable = " + timesTable);
            for (int base = 1; base <12 ; base++) {
                System.out.println(timesTable +" x " + base + " = " + timesTable* base);


            }

        }
    }
}
