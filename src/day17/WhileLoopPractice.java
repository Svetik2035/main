package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //Count 1 to 5 than count  from 5 to 1
        int counter = 1;
        while (counter <= 5) {
            System.out.print(counter + " ");// we used print  NOT println to stay in one line
            ++counter;
        }
        System.out.println();//to get them on separate lines
        System.out.println("counter = " + counter);
        /*now I want to count from 5 to 1, using the same counter
        //now I want to count from 5 to 1
        while( counter>1 ){ //or >0
            --counter;*/

        System.out.print(counter + " ");

        while (counter> 1){
            --counter;
            System.out.print(counter + " ");
        }
        System.out.print("counter after decrement = " + counter);

        }

    }



