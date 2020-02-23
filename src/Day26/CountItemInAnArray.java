package Day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
        String [] marvelHeroes = {"Iron Man", "Captain America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spiderman",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length ;
        System.out.println("sizeOfArray = " + sizeOfArray);


        String itemToSearch = "Black Widow";
        int countOfItem = 0;
        for (String eachHero : marvelHeroes) {
            if (eachHero.equals(itemToSearch)){
                countOfItem ++;
                            }
        }
        System.out.println("countOfItem = " + countOfItem);
        //count the hero with word "black" in the name
        
        int cntOfBlackInName = 0;
        
            for (String eachHero : marvelHeroes) {
                if(eachHero.toLowerCase().contains("Black")){
                    cntOfBlackInName ++;
                }
            
        }
        System.out.println("cntOfBlackInName = " + cntOfBlackInName);
    }

}
