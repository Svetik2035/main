package day54;

public class Utility {

    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 =  new Clothes();
        wearMyWearable(w2);

        Wearable w3 = new Clothes();
        wearMyWearable(w3);

        Wearable w4 =  new Clothes();
        wearMyWearable(w4);
        // here directly passing the object without storing into a variable
        wearMyWearable( new Watch());
        //wearMyWearable( new String());we cannot do it because it is not Wearable

        Wearable result = getMyWearableObject();

    }
    //  create a static method called getMyWearableObject
    // it returns a wearable object(or anything IS-A Wearable)

    public static  Wearable getMyWearableObject (){
        /* we only can return one thing
        Method one -assign an object and return it:*/
        Wearable w = new Clothes();
        return w;

       /* Method two directly return one of those:*/

       //return  new Clothes();
       //return new Watch() ;
      // return new Perfume();
     //  return new Makeups();
    }

    //create a static void method wearMyWearable; it allows us to call it directly
    //it has 1 parameter with type Wearable
    //we made it static so we can just call it directly

    public static void  wearMyWearable (Wearable any ){

        any.wear();

    }
}
