package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        // we created array in short way by just opening up {}
        //we put them in different line since white space does not matter
       /* String [] shows = {"Orville" ,
                          "Gifted" , "Games of Thrones",
                         "Flash" , "Arrow" , "Super Girl"
                          }; or they can be in one line*/
        String [] shows = {"Orville" ,"Gifted" , "Games of Thrones","Flash" , "Arrow" , "Super Girl"};

        int showsCount = shows.length ;
        System.out.println("showsCount = " + showsCount);

        for (int x = 0; x < showsCount ; x++) {
            String currentShow = shows[x];
            System.out.println(currentShow + " has character count " + currentShow.length());

             String myFavoriteShow = shows[0] ;
             /* in two different steps
            System.out.println("myFavoriteShow = " + myFavoriteShow);
            System.out.println("myFavorite show character count is ; " + myFavoriteShow.length());*/

            //in one shot

           // System.out.println("myFavoriteShow = " + myFavoriteShow + "myFavorite show character count is : "
                 //   + myFavoriteShow.length());
            //shows[x]-this is String in this example; this is the third method to do it


            System.out.println( shows[x] + "myFavorite show character count is : "  + shows[x].length());





        }
    }
}
