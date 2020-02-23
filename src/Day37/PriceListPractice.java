package Day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {

    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("Price List = " + priceList);

        //change the third price to $10
        //third item index is 2
        // and set method is using an index and new value as arguments when being called
        priceList.set(2,10.0);
        System.out.println("Third item new price = " + priceList.get(2));

        //Add 4 dollars to first price : 1-st price value should be original price + 4
        priceList.set(0 , priceList.get(0) + 4);

        //change last price to sun\m of first and second price
        Double sumOfFirstTwoItems = priceList.get(0) + priceList.get(1);
        priceList.set (priceList.size()-1 , sumOfFirstTwoItems);
        System.out.println("New Price List = " + priceList);

        //give 40% for the second price
        priceList.set(1, priceList.get(1)*0.6);
        System.out.println("After 40% Off second item value is " + priceList.get(1));

        //Double the value of each and every price in the list
        //this is how  we are doing it for one, now we do it for all
        // of them by replacing the index with variable
        //in order to update an item we need an index and new value
        // in order to update the first  value index will be 0
        //in order to double  the price from original, first we need to get the original value
        // then multiply by 2 and use that value for 2-nd parameter of set method
        //double  newValue = priceList.get(0)*2;
       // priceList.set(0, newValue);
        System.out.println("priceList before doubling = " + priceList);
        for (int i = 0; i <priceList.size() ; i++) {
            double newValue = priceList.get(i)*2;
            priceList.set(i, newValue);

        }
        System.out.println("priceList after doubling = " + priceList);

        //Cut the prices into half if the price is more than $20

        for (int i = 0; i <priceList.size() ; i++) {
            double eachPrice = priceList.get(i);

            if (eachPrice >= 20){
                priceList.set(i , eachPrice/2);

            }
            }
        System.out.println("PriceList after cutting half the prices more or equals than 20 : \n\t " + priceList);

        //swap the first value with the last value
        int lastIndex = priceList.size()-1;
        Double temp =priceList.get(0);
        priceList.set(0, priceList.get(lastIndex));
        priceList.set(lastIndex , temp);
        System.out.println("PriceList after swapping first and last value : \n\t" + priceList);






    }
}