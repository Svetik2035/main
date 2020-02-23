package day45;

public class Fruit {
    //Always add no Arg constructor in Super class
    // to avoid unnecessary error of sub class calling
    // super class's no arg constructor
    public Fruit(){
        System.out.println("Fruit constructor message");
    }
    public Fruit(String str){
        System.out.println("One Arg Fruit constructor");
    }
}
