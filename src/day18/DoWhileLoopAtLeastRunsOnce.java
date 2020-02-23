package day18;

public class DoWhileLoopAtLeastRunsOnce {
    public static void main(String[] args) {
        //While LOOP VS Do While LOOP
        /*1.While LOOP checks the condition first than enters the statement
        2. Do While Loop will take an action at least once then check the condition
        3. Do While Loop ALWAYS RUNS AT LEAST ONe Iteration
        4. WhileLOOP might NOT EVEN RUN!
         */
        int x =1000 ;

        do{
            System.out.println("KEEP GOING ");
        }while(x<5 );
        System.out.println("THE END");
        while (x<5) {
            System.out.println("KEEP Going In While");
        }
    }
}
