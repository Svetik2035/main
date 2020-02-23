package day47;

public class FinalVariablePractice {
    public static void main(String[] args) {

        int x = 10;

        x = 100;
        final int a = 20;

       final Student s1 = new Student(101);
        System.out.println(s1.studentID);

        s1.studentID = 200;
        System.out.println(s1.studentID);


       // to print static way do this:
        System.out.println(Student.SCHOOL);

        System.out.println(Byte.MAX_VALUE);

}}
