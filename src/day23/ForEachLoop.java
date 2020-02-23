package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double [] prices = {99.23, 11.99, 100.23, 99.99, 56.34 };
        
        //for each loop syntax
        //for (dataTypeOfYourArray VariableNameForEachItem : yourArrayVariable ){
        //do something with your items
        /* first way to do it*/

        for (int x = 0; x < prices.length; x++) {
            double eachPrice = prices [x];
            System.out.println("eachPrice = " + eachPrice);

            // this is another way to do it
            //FOR THIS LOOP CAN ONLY BE USED FOR ARRAY
            // THERE IS NO INFINITE LOOP EVER IN FOR EACH LOOP
        }
        for(double eachPrice  : prices){
            System.out.println("eachPrice = " + eachPrice);
                    
        }
        
        
    }
}
