package Day30;

public class CarInventory {
    public static void main(String[] args) {
        String []cars ={"Acura-NSX",
                        "Chevrolet-Corvette",
                        "Chevrolet-Cavalier",
                        "BMW-3 Series",
                        "Pontiac-LeMans",
                        "Oldsmobile-Achieva",
                        "Honda-Civic"};
        //task1: Count how many Chevrolet  and Civic is in this Array
        // we can use contains , StartWith, endsWith to get the same result
        int chevyCount = 0;
        int civicCount = 0;
        for( String eachCar : cars ) {
           // if(eachCar.startsWith("Chevrolet")){
            //what if I want case insensitivity
            if(eachCar.toLowerCase().startsWith("chevrolet")){
                chevyCount++;// incrementing by 1
        }
            if( eachCar.toUpperCase().contains("CIVIC")){
                civicCount++;
            }
        }
        System.out.println("chevyCount = " + chevyCount);
        System.out.println("civicCount = " + civicCount);
                


    }
}
