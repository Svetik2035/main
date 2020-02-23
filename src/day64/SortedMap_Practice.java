package day64;

import java.util.Map;
import java.util.TreeMap;

public class SortedMap_Practice {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new TreeMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //Interview Questions:
        /**Difference between HashMap, LinkedHashMap, treeMap:
         * TreeMap - sorted, LinkedHashMap - keeps order, HashMap - regular, but faster
         *
         * Difference between HashMap and HashSet:
         * HashSet is an implementation of Set Interface, and it stores unique elements per item;
         * HashMap is an implementation
         *
         * */


    }
}
