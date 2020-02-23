package day21;

public class NumberStairCase {
    public static void main(String[] args) {
        //1         -->> print 1 to 1
        //1 2       -->> print 1 to 2
        //1 2 3     -->> print 1 to 3
        //1 2 3 4   -->> print 1 to 4
        //1 2 3 4 5 -->> print 1 to 5
        //etc

        for (int x = 1; x <= 10 ; x++){

            for (int i = 1; i <=x ; i++) {
             System.out.print( i + " ");

            }
            System.out.println();
        }
    }

}
