package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        //skip counting by 2
        //starting from 0-100
        for (int i = 0; i < 100; i += 2) { //or i = i+2
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------even number");

        //skip counting by 3
        //starting from 0-100
        for (int x = 0; x < 100; x += 3) {
            System.out.print(x + " ");


            //short cut for generating  for Loop is :fori and then push enter
            for (int i = 0; i < 100; i++) {


                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println(i + "  Is FIZZ BUZZ Number");

                }
            }
        }

    }
}