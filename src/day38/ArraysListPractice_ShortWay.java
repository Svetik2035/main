package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListPractice_ShortWay {
    public static void main(String[] args) {
        //create a list of 6 doubles in short way
        //we will just read them and will not add or remove item

        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67);
        prices.add(12.8);
        prices.remove(0);
        int count = 0;

        for(Double each : prices ){
            if(each>5){
                ++count;
            }
        }
        System.out.println("count =" + count);
        //I want to add 2 more prices (does not have the same list)
        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99);
        System.out.println("newPrices = " + newPrices);

        //Create an ArrayList Object in shot with many  items so we can add or remove
        //Just one option to create ArrayList Object in one short
        List<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67));
        System.out.println("oneShotPrice before = " + oneShotPrice);
        oneShotPrice.add(1, 100.99);
        System.out.println("oneShotPrice after adding 100.99 = " + oneShotPrice);
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice after removing 3-rd item = " + oneShotPrice);
    }
}
