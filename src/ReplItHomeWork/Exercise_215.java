package ReplItHomeWork;

import java.util.ArrayList;

public class Exercise_215 {
    public static void main(String[] args) {
        //Instructions from your teacher:
        //Create a method that:
        //
        //is called twoTimes
        //returns a new ArrayList of Integers
        //takes in a single parameter - an ArrayList of Integers
        //
        //This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.
        //
        //For example, if the parameter is
        //(1,5,3,7)
        //The method should return a new ArrayList of Integers with
        //(1,1,5,5,3,3,7,7)
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
        ArrayList<Integer> why = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            why.add(list.get(i));
            why.add(list.get(i));
        }

        return why;
    }
}


