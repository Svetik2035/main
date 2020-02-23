package day48;

public class Ball  implements Bounceable{
    String shape;
    String color;

    public Ball(String shape, String color){
        this.shape =shape;
        this.color =color;

    }

    public Ball() {

    }


    @Override
    public void bounce() {
        System.out.println("This " + shape + " and "  + color +
                    " ball is bouncing if gravity is " + GRAVITY);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Ball b1 =new Ball();
        b1.bounce();

        System.out.println(GRAVITY);
    }
}
