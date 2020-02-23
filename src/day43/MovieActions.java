package day43;
import day42.Movie;
//this class has a lot of static methods to deal with movie object
//this class does not  serve as template for creating object
//just like arrays class does not serve as template for creating array object
public class MovieActions {
    public static void main(String[] args) {

        Movie m1 = new Movie("Joker", 2.5, "Drama");
        printMovieInformation(m1);

        Movie m2 = new Movie("Cinderella", 1.5, "Family");
        printMovieInformation(m2);
        /*a void method that accepts
        * */
    }
    public static void printMovieInformation(Movie movieObj){
        System.out.println("The movie name " + movieObj.getName());
        System.out.println("is " + movieObj.getLength() + " hour long " );
        System.out.println(" and it genre is " + movieObj.getType());
    }
}
