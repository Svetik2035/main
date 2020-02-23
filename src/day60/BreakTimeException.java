package day60;

public class BreakTimeException extends RuntimeException {
}
class Main{

    public static void main(String[] args) {
//        throw new BreakTimeException();
        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("WOLA MY OWN THING CAUGHT!!!");
        }
      /*How do you create your own checked exception type :

    ALL YOU NEED IS TO CREATE A SUBCLASS OF ANY CHECKED EXCEPTION WITH YOUR OWN NAME


    public class HittingHeadToWallException extends Exception (or any sub class of it) {


    }


            // This is how we can create our own checked exception
            public class MyOwnCheckedException extends Exception{


            }
            // This is how we can create our own unchecked exception
            public class BreakTimeException extends RuntimeException{

            }

            You can treated just like any other exception type Java already provided


                // First create a file by right clicking day60 package and select new -- File
                // name your file as note.txt
                // enter few line of text
                // close the file (it might ask you to save , if it did not it means it already saved)
                // then use
                // List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt"));
                // the method declare to throw checked exception so HANDLE OR DECLARE  !!
                // for reading the file and storing it into the list
                // make sure the path is correct , if not , it will throw exception
                // print out the list content using loop to see whats inside line by line*/


    }


}