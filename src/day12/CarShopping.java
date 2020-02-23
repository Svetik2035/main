package day12;

public class CarShopping {

    public static void main(String[] args) {
        //Buy Corolla or Tesla(only if it's  within the budget)// condition is only apply to Tesla,
        // not to Corolla!!
        //there is only one car covered with cloth
        //we do not know what care is it and what is a price
        //once we take out the cloth
        //we check weather it's Toyota, if it is, we buy it without checking the price
        //if it  is not we check if it is a Tesla and also check weather it is within the budget
        String carBrand = "Honda" ;
        int carPrice= 60000 ;
        int budget  = 60000 ;

                         /*true, if we have one true, than everything is true
        if (carBrand.equals("Corolla") ||carBrand.equals("Tesla") && carPrice <= budget) {
            System.out.println("CAR ACQUIRED!!!!");
        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR");

        }
*/
     if (carBrand.equals("Corolla")) {
         System.out.println("Corolla CAR ACQUIRED!!!!");
     }else if (carBrand.equals("Tesla") && carPrice <=budget ) {
         System.out.println("Tesla CAR ACQUIRED!!!!");
     }else{
         System.out.println("NOT WHAT I AM LOOKING FOR");
     }
     // DRY principal- Do not repeat yourself



        }
}
