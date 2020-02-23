package day48;

public class Kangaroo implements Bounceable, BoxerWithBellyPouch{

    String name;
    int jumpDistance;

    public Kangaroo(String name , int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

        public void eat(){
            System.out.println("Kangaroo with name " + name + " is eating");

        }
        @Override
        public void kickBox(){
            System.out.println("Kangaroo with name " + name + " is kicking");
        }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo " + name + " carries her child in her pocket");
    }


    @Override
    public void bounce() {
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + GRAVITY + " gravity");


    }

}
