package Day37;

import java.util.ArrayList;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {
        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");

        printAList( nameLst);


        // Create a method that accept a List of String as argument
      // same thing as a method that has List of String parameter
      // and print out each and every item in the list vertically
     // return nothing



        }
    public static void printAList( ArrayList<String> lst){
        for (String each : lst) {
            System.out.println("each = " + each);

        }
      //  public static String getTheLongestElements(List<String> nameLst){
    }
}
