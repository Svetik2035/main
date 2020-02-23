package Day26;

import java.util.Arrays;

public class SwappingValue {
    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";

        String tempContainer = name1;//Emma
        name1 = name2 ;//name1-->> Jason
        name2= tempContainer; //name2 -->>Emma

        System.out.println("name1 = " +name1);
        System.out.println("name2 = " +name2);


        // 1.4 Swap the first item value with last item value
        int[] myNumbers = {10,40,30,7};

        int temp = myNumbers[0];//temp now has 10
        myNumbers[0] = myNumbers [3];//first item value became 7
        myNumbers[3] = temp;// last item became 10

        System.out.println("first item = " +myNumbers[0]);
        System.out.println("last item = " + myNumbers[3]);

        System.out.println("myNumbers = " +Arrays.toString(myNumbers));// printing out changed swapped numbers

        // swapping
        int temp2 = myNumbers[1];//temp now has 40
        myNumbers[1] = myNumbers [2];//first item value became 30
        myNumbers[2] = temp2;// last item became 40

        System.out.println("second item = " + myNumbers[1]);
        System.out.println("third item = " + myNumbers[2]);

        System.out.println("myNumbers = " +Arrays.toString(myNumbers));// printing out changed swapped numbers
        //leads to reversed array

        // how did I come up with 0 and 3
        // how did I come up with 0+1 and 3-1=2

    }

}
