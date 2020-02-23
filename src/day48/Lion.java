package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals{

    @Override
    public void makeNoise() {
        System.out.println("Lion Drinks Milk");
    }

    @Override
    public void drinkMilk() {
        System.out.println("Lion Says ROARRRRR!!!!");

    }

    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        //any class I have created , it can be a data type for variable
        //also, known as a reference variable

        Animal a1 = new Lion();
        a1.makeNoise();

        List<Integer> lst = new ArrayList<>();

    }
}
