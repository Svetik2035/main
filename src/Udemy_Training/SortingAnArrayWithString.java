package Udemy_Training;

import java.util.Arrays;

public class SortingAnArrayWithString {
    public static void main(String[] args) {

  String [] names = {"John", "Adam", "Don"};
  //Syntax for sorting elements:
        Arrays.sort(names);
        for(String item : names){
            System.out.println("names "+ item);
            //names Adam
            //names Don
            //names John
            //we need to remember that special correctors come before numbers,
            //numbers come before letters, Upper case letters come before lower case letters in ASCII table


        }
    }

}
