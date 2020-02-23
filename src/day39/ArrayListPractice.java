package day39;

import java.util.ArrayList;
import java.util.Arrays;

    public class ArrayListPractice {

        public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
            ArrayList<String> productLst
                    = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                    "iPhone 6s Plus,549,22.88",
                    "iPhone X,1149,56.16",
                    "MacbookPro,1499.99,79.49",
                    "ThumbDrive,39.99,2.68",
                    "Beats HeadPhones,349.99,15.12",
                    "Mouse,79.99,8.98",
                    "Charger,39.99,4.56",
                    "iPad,429,18.31",
                    "Dyson Vacuum,399,16.25",
                    "TV,2199,89.49",
                    "Apple Watch,559,21.18"));
            System.out.println("productLst = " + productLst);
            System.out.println("productLst element count" + productLst.size());

            String itemDetails = "iPhone 6s,449,18.71";
            System.out.println("item name = " + itemDetails.split(",")[0]);
            System.out.println("item price = " + itemDetails.split(",")[1]);
            System.out.println("item name = " + itemDetails.split(",")[2]);

//         * Task 1 : print only items name
            for (String eachProduct : productLst) {
                //we get each product, then we split by"," to split into three parts
                // we get first part of 3--> Name
                String namePart = eachProduct.split(",")[0];
                System.out.println("eachProduct name = " + eachProduct);
            }
            //another version to use for loop instead of for ech loop:
            //we get each product, by using methods of ArrayList in for loop
            //then we split by comma to split into 3 parts
            // we get first part of 3--> Name
            for (int i = 0; i < productLst.size(); i++) {
                String namePart = productLst.get(i).split(",")[0];
                System.out.println("eachProduct name = " + namePart);
            }

//         * Task 2 : print all the prices more than 500
            for (String eachProduct : productLst) {
                double price = Double.parseDouble(eachProduct.split(",")[1]);

                if (price > 500) {// print only products, which price is higher than 500
                    System.out.println("price = " + price);
                }

            }


//         * Task 3 : print average price
            double sum = 0;
            double average = 0;
            // lets just reuse the above data that we already discovered
            for (String eachProduct : productLst) {
                double price = Double.parseDouble(eachProduct.split(",")[1]);

                sum = sum + price;// sum+= price;
            }
            average = sum / 12;// productLst.size(); if we do not know a number
            System.out.println("sum = " + sum);
            System.out.println("average = " + average);

            System.out.println("\n----------- Task 8 ---------");
            //*Task 8 : Count the items prices more than average price.
            int cnt = 0;
            for (String eachProduct : productLst) {
                double price = Double.parseDouble(eachProduct.split(",")[1]);
                if (price > average) {
                    ++cnt;
                }
            }
            System.out.println("All the items with prices more than average price = " + cnt);

//         * Task 4 : print all the items name that has less than 20$ monthly payment.
            for (String eachProduct : productLst) {
                String name = eachProduct.split(",")[0];
                double monthly = Double.parseDouble(eachProduct.split(",")[2]);

                if (monthly < 20) {
                    System.out.println(name + " " + monthly);
                }
            }
            System.out.println("---------------Task 5-------------------");

//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
            for (String eachProduct : productLst) {
                String name = eachProduct.split(",")[0];
                double monthly = Double.parseDouble(eachProduct.split(",")[2]);

                if (name.contains("iPhone")) {
                    System.out.println(name + " " + monthly);
                }
            }
            System.out.println("\n-----------------------Task 6 ------------with only Price---------");
//         * Task 6 : Print all information about the most expensive item.
            double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
            String maxPriceItem = "";

            for (String eachProduct : productLst) {
                double price = Double.parseDouble(eachProduct.split(",")[1]);

                if (price > maxPrice) {
                    maxPrice = price;
                    maxPriceItem = eachProduct;
                    // we need to fond a location to find a maxPrice
                }

            }
            System.out.println("maxPriceItem = " + maxPriceItem);
            System.out.println("maxPriceItem  is at index:  " + productLst.indexOf(maxPriceItem));
            System.out.println("\n-----------------------Task 6 ------------with Product details---------");

            double maxPrice2 = Double.parseDouble(productLst.get(0).split(",")[1]);
            int maxPriceIndex = 0;
            for (int i = 0; i < productLst.size(); i++) {
                //this is how we get each price part of items details
                String priceStr = productLst.get(i).split(",")[1];
                //this is how we turn the priceString into double data type
                double price = Double.parseDouble(priceStr);
                if (price > maxPrice2) {
                    maxPrice2 = price;
                    maxPriceIndex = i;
                }
            }
            System.out.println("maxPriceIndex = " + maxPriceIndex);
            System.out.println("maxPrice = " + maxPrice2);
            System.out.println("Expensive Item Details = " + productLst.get(maxPriceIndex));


            System.out.println("\n----------- Task 7 ---------");

//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)\

         //These three did not worked, because these are String methods,
         // but our ArrayList of String it is not a String,
            //it is an arrayList,and we have to use ArrayList methods
            System.out.println(productLst.contains("Dyson"));// false
            System.out.println(productLst.indexOf("Dyson")); // -1
            // System.out.println(productLst.startsWith("Dyson")); // Compiler error
            int dysonIndex = 0;

            for (int i = 0; i < productLst.size(); i++) {

                if (productLst.get(i).startsWith("Dyson")) {
                    dysonIndex = i;
                }
            }
            /* the Pure logic in here: take the dyson price from the list and update its price to %80 off*/
            System.out.println("dysonIndex = " + dysonIndex);
            // This is original dyson details using the index
            String dysonDetails = productLst.get(dysonIndex);
            // in order to get 80% off the price and put it back to list
            // we need the price and monthly in double format so we can do calculation
            String name = dysonDetails.split(",")[0];
            double price = Double.parseDouble(dysonDetails.split(",")[1]);
            double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
            // Putting it back to the dysons details after doing the calculation
            // 80% off means you are paying for 20% of original price
            dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

            System.out.println("dysonDetails = " + dysonDetails);
            // then use the set method to set the value back to the list
            productLst.set(dysonIndex, dysonDetails);
            System.out.println("productLst = " + productLst);

            System.out.println("\n----------- Task 9 ---------");
//
//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
            for (int i = 0; i < productLst.size(); i++) {
                double price1 = Double.parseDouble(productLst.get(i).split(",")[1]);
                if (price > average) {
                    productLst.remove(i);
                    --i;// his line wil help me to comeback to index 0 after removing [0] item,and do not skip
                    // any numbers during the iteration in the loop
                }
            }
            System.out.println("productLst count after removing = " + productLst.size());

            System.out.println("\n----------------task Three ArrayList Objects ---------------------");

//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
            ArrayList<String> itemNames = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Double> monthlyPayments = new ArrayList<>();

            for (String eachProduct : productLst) {
                // store the name part into ItemName list
                String name1 = eachProduct.split(",")[0];
                itemNames.add(name1);
                // store the name price into prices list
                double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
                prices.add(pricePart);
                // store the name monthlyPart into monthlyParts list
                double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
                monthlyPayments.add(monthlyPart);

            }

            System.out.println("itemNames = " + itemNames);
            System.out.println("prices = " + prices);
            System.out.println("monthlyPayments = " + monthlyPayments);
            //Another way for doing it:

            // String item1 = "iPhone 6s,449,18.71";
            //String [] partsOfItem = item1.split(",");
            //namesOfProducts.add(partsOfItem[0]);
            //pricesOfItems.add(Double.parseDouble(partsOfItem[1]));
            //monthlyPayments.add(Double.parseDouble(partsOfItem[2]));

        }

    }



