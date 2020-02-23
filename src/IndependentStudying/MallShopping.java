package IndependentStudying;

public class MallShopping {
    public static void main(String[] args) {

                String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
                double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
                int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //TASK 1. Check if all 3 arrays are exact same length
        //Print "All arrays are equal length"
               int a = items.length;
               int b = prices.length;
               int c = itemIDs.length;

              /* if(a == b && b==c && a == c) {
                   System.out.println("equal");
               } else {
                   System.out.println(" not equal");
               }

                   //TASK 2. Print how many items purchased
                  System.out.println("Items count: " + a);// or b or c because they are all equal

                   //TASK 3. Print a receipt report.
                   /*
                        12345 - Shoes - $99.99
                        ...
                        458.8 * 0.06 + 458.8
                        Total price: $458.8 (include tax)
                     */
                  /* double sum = 0.00;
                   double totalPrice= 0.00;
                   for (int i = 0; i <6 ; i++) {
                       System.out.println(itemIDs[i] + " - " + items[i] + " - " + prices[i]);
                     sum = sum + prices[i];
                   }
                   totalPrice= sum*0.06 + sum;

                   System.out.println("Total price: " + totalPrice + " (include tax)");


                        //TASK 4. Find/Look for "Airpods" in items and print along with price and itemID
                for (int j = 0; j <6 ; j++) {
                   if(items[j].equalsIgnoreCase("Airpods")){
                        System.out.println(prices[j]+" "+itemIDs[j]);
                    }
                }*/
                //TASK 5. Find the most expensive item and print all details
                //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}
               // double temp = 0.00;
                 double maxPrice = 0;
                int maxPriceIndex = 0;
                  for (int k = 0; k <prices.length ; k++) {
                      if (maxPrice < prices[k]) {
                          maxPrice = prices[k];
                          maxPriceIndex = k ; // store the index of max item

                      }

                      }
                     System.out.println("first maximum number:") ;

                     System.out.println(itemIDs[maxPriceIndex] + " - "
                             + items[maxPriceIndex] + " - " + prices[maxPriceIndex]);


                }
            }








