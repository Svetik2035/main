package day63;

import java.util.HashSet;
import java.util.Set;

public class FindingUnique {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
        //How many unique characters showed up in above sentence?
        //Basically we are looking for all non-repeating character to make up this sentence
        //for example if  if you have AABBBCCC-> ABC
        /*I. One way to do it:
        1. find a data structure that automatically removed duplicates (create a HashSet object with type Character)
          2. iterate over each character in above String
          3. then, add it to the object (HashSet) so it can remove duplicates for us
        * */
        Set<Character> charSet = new HashSet<>();//unpredictable order
       // Set<Character> charSet = new LinkedHashSet<>();//this gives an order that character has shows up
       // Set<Character> charSet = new TreeSet<>();// prints in ascending order
        for (int x = 0; x < str.length(); x++) {
            charSet.add(str.charAt(x));
        }
        System.out.println("How many character overall ? " + str.length());
        System.out.println("How many Unique Characters ?  " + charSet.size());
        System.out.println("charSet = " + charSet);
        for(Character eachChar : charSet){
            System.out.println("each Unique Char = " +eachChar);
        }
    }
}
