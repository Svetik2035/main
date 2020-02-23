package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
         //indexOf-->>
        //find out index of another string inside this String
        //  indexOf -> 012345678901
        String name = "Game of Java" ;//length is 12, but last corrector index is 11,
        // because we started from 0


        //find out the location of Java
        //find out the location of letter o
        //find out the location of first space
        System.out.println("find out the location of Java");
        System.out.println( name.indexOf("Java"));

        System.out.println("find out the location of o");
        System.out.println( name.indexOf("o"));

        System.out.println("find out the location of uppercase O");
        System.out.println( name.indexOf("O"));//minus number is means we do not have it
        // for example: -1

        //find out the location of first space
        System.out.println("find out the location of first space");
        System.out.println( name.indexOf(" "));


    }

}
