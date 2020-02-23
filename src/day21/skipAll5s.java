package day21;

public class skipAll5s {
    public static void main(String[] args) {
        //count 1 to 100
        // skip all the numbers divisible by 5
        // x % 5 == 0 -->> divided without a  remainder
        for (int x = 1; x <= 100; x++) {

            if (x % 5 == 0) {
                System.out.println("SKIPPING " + x);
                continue;// put System.out.println(); printing code right after continue or break,
                // because it will  be an unreachable code
                //put thus above continue or break
            }
            System.out.println(x);
        }

        //another way to do the same thing!!!

        for (int x = 1; x <= 100; x++) {
            if (x % 5 != 0) {
                System.out.println(x);
            } else {
                System.out.println("SKIPPING " + x);
            }


        }
    }
}
