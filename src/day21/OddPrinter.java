package day21;

public class OddPrinter {
    public static void main(String[] args) {
        //count from 1 to 10
        // print only odd numbers
        // repeat this 4 times



            /*
             *  count from 1 to 10 --> print only odd numbers
             *  repeat this 4 times
             * */



                for (int x = 1; x <= 4; x++) {
                    System.out.println("Iteration : " + x);

                    for (int y = 1; y <= 10; y++) {

                        if (y % 2 == 1) {
                            System.out.print(y + " - ");
                        }

                    }
                    System.out.println();


                }



            }

    }
