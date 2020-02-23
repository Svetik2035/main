package DAY44;

public class CourseCreator {
    public static void main(String[] args) {
        Course c1 = new Course("Java", "Foundation");
        Course c2= new Course("Selenium", "Automation");
        Course c3 = new Course("SQL", "Database");
        Course c4 = new Course("API", "Webservices");
        Course c5 = new Course("Agile", "SoftSkills");

        System.out.println("Course.counter = " + Course.counter);

    }
}
