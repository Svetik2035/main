package Day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Cyborg");
        superHeroes.add("Aquaman");
        superHeroes.add("Flash");

        System.out.println("superHeroes = " + superHeroes);
        //do we have  superman in the list
        System.out.println("superHeroes contains(\"Superman\")= " + superHeroes.contains("Superman"));
        //do we have man in the list
        System.out.println("superHeroes contains(\"man\")= " + superHeroes.contains("man"));

        for (int x = 0; x <superHeroes.size() ; x++) {
            String currentHero = superHeroes.get(x);
            if( ! currentHero.contains("man")){
                superHeroes.remove( currentHero );
            }

        }
        System.out.println("superHeroes = " + superHeroes);


    }
}
