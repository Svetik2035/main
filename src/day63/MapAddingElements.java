package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {
        //Creating HashMap objects
        Map<String,Integer> nameAgePair = new HashMap<>();
        //adding elements: put
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammed",21);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("Ruhksona",16);
        //The key of the Map is unique, it does not accept a duplicate
        //here since we already have Zehra--> it will just replace the old value with a new value
        nameAgePair.put("Zehra",7);

        System.out.println("nameAgePair = " + nameAgePair);
        //getting the size of a map
        System.out.println("nameAgePair.size() = " + nameAgePair);

        //how do we get a value according to the key
        System.out.println("Zehra's Age = " +nameAgePair.get("Zehra"));

        // how can we check if a key(name) is already exists
        //containsKey method
        System.out.println("nameAgePair.containsKey (\"Ruhksona\")" + nameAgePair.containsKey("Ruhksona"));
        System.out.println("nameAgePair.containsKey (\"Hasan\")" + nameAgePair.containsKey("Hasan"));
        //How do I only add new  items if it does not already  exist(java 8 addition)
        nameAgePair.putIfAbsent("Zehra",10);

        //updating the element in the Map using replace
        nameAgePair.replace("Maiia",17);
        System.out.println("nameAgePair+.get(\"Maiia\") =" + nameAgePair.get("Maiia"));

        nameAgePair.replace("Zehra", 7, 10);
        System.out.println("nameAgePair+.get(\"Zehra\") =" + nameAgePair.get("Zehra"));

        nameAgePair.remove("Fatih");
        System.out.println("nameAgePair+.get(\"Fatih\") =" + nameAgePair.get("Fatih"));

        System.out.println("nameAgePair.containsKey (\"Fatih\")" + nameAgePair.containsKey("Fatih"));
    }
}
