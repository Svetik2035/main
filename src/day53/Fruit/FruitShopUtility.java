package day53.Fruit;

public class FruitShopUtility {
    public static void main(String[] args) {
        Fruit f1 = new Apple("sweet", "red", "Fuji");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);

    }
    // Create a static void method called digestBetter
// it has a parameter as type Fruit
// and inside the method , it will digest the Fruit object 4 time then displayInformation

    public static void digestBetter(Fruit anyFruit){
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();


    }
// Create a static method called getMyFavoriteFruit
// accept no parameter and return your Favorite Fruit Object
    //display fruit
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Display fruit \n" + anyFruit.toString()) ;
    }
    //


        }
