package day64;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new java.util.LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
