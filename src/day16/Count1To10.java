package day16;

public class Count1To10 {
    public static void main(String[] args) {
        int counter = 1 ;

        while( counter< 11){
            System.out.println("counter values : " + counter);//something has to be done to change the condition
            // along the way, because it will be running forever
            ++ counter;

            //10<= 10 -->> true   11<= 10 -->> false
            //10< 11 -->> true    11< 11 -->> false

        }

    }
}
