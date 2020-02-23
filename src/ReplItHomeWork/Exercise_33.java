package ReplItHomeWork;

        import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {


    /* Instructions from your teacher:

     Scientists estimate that roughly 10 grams of caffeine consumed at one time is a  lethal overdose.
      Write a program with a variable that holds the number of milligrams of caffeine
     in a drink and outputs how many drinks it takes to kill a person. In one gram, there is 1000 mg.
     Please refer to the image above as an example and use any number of variables you want.
     Dots mean space in the picture.

     Formula to get drink count to cause an overdose is
     10*1000 / drinkCount*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");

        int drinkCount =scan.nextInt();
        int numberOfMilligrams = 10*1000 /drinkCount;



        System.out.println("It would take about " + numberOfMilligrams
                + " drinks for a lethal overdose.");

    }

}
