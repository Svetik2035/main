package day53.Fruit;

public abstract class Fruit {
    String taste;
    String color;

    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    public abstract void getDigested();
    @Override
    public String toString() {
        return "HELLO FROM FRUIT";
    }

}
