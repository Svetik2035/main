package day42;

public class Movie {
    private String name;
    private double length;
    private String type;

    public Movie(){
        System.out.println("EMPTY MOVIE");
    }
    // write a construct to set all the fields value

    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public Movie(String s) {
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }
    //toString method so we can directly print out


    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
