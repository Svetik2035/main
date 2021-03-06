package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySEtView_MapIteration {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        Set<String> allNames = groceryPriceMap.keySet();

        for(String eachName : allNames) {
            System.out.print("eachName = " + eachName);
            System.out.println("| Value is " + groceryPriceMap.get(eachName));


        }
    }
}