package day12;

public class CheckingStringEqualityWithoutCase_1 {
    public static void main(String[] args) {

        String name ="svetlana" ;



        boolean nameEqualsWithoutCase = name.equalsIgnoreCase("Svetlana");
        System.out.println("Does this name has the same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);

        System.out.println(name.equalsIgnoreCase("SvetLana"));
        // store your name is a name variable
        //check for equality using different uppercase lowercase example
        //using equals and equalsIgnoreCase

    }
}
