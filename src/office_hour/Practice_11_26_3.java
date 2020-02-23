package office_hour;

public class Practice_11_26_3 {
    public static void main(String[] args) {
        // if the season is
        // spring, summer, fall-->>print bear are active
        //winter-->> print bear sleep:

       /*
        if (season.equals("spring") ) {
            System.out.println("bear is active");
        }else if (season.equals("summer")){
            System.out.println("bear is active");
        }else if (season.equals("fall")) {
            System.out.println("bear is active");
        }else{
            System.out.println("bear is sleeping");
        }*/

       // the same if write
    /*if(season.equals("spring") || season.equals("summer") || season.equals("fall")) {
        System.out.println("bear is active");
    }    else{
        System.out.println("bear is sleeping");


        }*/
    // or we can do it through switch statement
        String season ="fall ";
        switch (season) {
            case "Spring":
            case "Summer":
            case "Fall":
                System.out.println("bear is active");
                break;
            case "Winter":
                System.out.println("bear is sleeping");
                break;
        }
        }
}
