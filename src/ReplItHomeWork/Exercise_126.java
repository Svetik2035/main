package ReplItHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //String str = "olive, fish, pursuit, old,  warning, python, java, coffee, cat, ray ";
        //create an array and split by a comma and space:
        String[] arr = str.split(", ");
        //find the shortest word and find only one word

        int shortestLength = arr[0].length();
        for (String each : arr) {
            if(each.length()< shortestLength){
            shortestLength = each.length();
        }
    }
     //find how many words have shortest length
                int count =0 ;
                for(String each : arr){
                if(each.length()==shortestLength){
                count++;
                }
                }
                String[] arr2 = new String [count];
                //Store all shortest words inside of arr2 array
                int index = 0;
                for( String each : arr) {
                if (each.length() == shortestLength) {
                arr2[index] = each;
                index++;

                }
                }
                //sort and print arr2 with shortest words
                Arrays.sort(arr2);
                System.out.println(Arrays.toString(arr2));
                }}



       /* Instructions from your teacher:
        Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings.  Print array with Arrays.toString() method. Sort array before printing.
        Split values by comma: split(", ");
        input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        output: [cat, old, ray]*/


