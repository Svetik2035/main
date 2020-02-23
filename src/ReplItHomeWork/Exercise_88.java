package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        // code starts here

        int iCat = word.indexOf("cat");
        int iDog = word.indexOf("dog");

        while (iCat != -1) {
            ++countOfCats;
            iCat = word.indexOf("cat", iCat+1);
        }

        while (iDog != -1) {
            ++countOfDogs;
            iDog = word.indexOf("dog", iDog+1);
        }

        System.out.println(countOfCats==countOfDogs);
    }
}
            /* another way to do it

               for (int x = 0; x <word.length()-2 ; x++) {
        ​
                    if(word.substring(x,x+3).equalsIgnoreCase("cat")){
                        countOfCats++;
                    }else if(word.substring(x,x+3).equalsIgnoreCase("dog")){
                        countOfDogs++;
                    }
        ​
                }
                if(countOfCats==countOfDogs){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
        ​
            }*/
