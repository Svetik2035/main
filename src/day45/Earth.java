package day45;

public class Earth extends Planet {
    //we have all them  from class Planet
    // double gravity;
    //    int radius;
    //    boolean hasLife;

    int population;

    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
        //    this.gravity = gravity;
        //   this.radius = radius;
        //   this.hasLife = hasLife;
        this.population = population;
    }

    public static void main(String[] args) {

        Earth e1 = new Earth(9.81, 500, true, 100000000);
        System.out.println("e1 = " + e1);
    }


    public String toString() {//you need use this method to print out
        return "Earth{" +
                "gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                "} ";
    }
}


