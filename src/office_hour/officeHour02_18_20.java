package office_hour;

public class officeHour02_18_20 {
    public static void main(String[] args) throws Exception {
   hi();
   test1();

    int num = 9;
    // my code does not compile
        System.out.println(num);
        /**Exceptions:
         * 1.Compile time exception == checked exceptions
         * right after you write a code, Javac checks a syntax
         *
         * 2. Runtime Exception = unchecked
         * JRE, JVM+libraries- run your code
         *
         * 2 ways to handle exceptios
         * 1. try catch
         * */
        try {
            String word = "java";
            System.out.println(word.charAt(6));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Please, take a look at index of the String");
        }catch(Exception e){
            System.out.println("mom exception catch it");
        }finally{
            System.out.println("this runs no matter what on the above");
        }
     /* when you run catch block it starts from specific to general!!!

     2.throws keyword
     mainly used for methods:
      */
}
  public static void test1() throws Exception{
        String name = "Cybertek";
      System.out.println(name.charAt(20));
  }
  public static void hi() throws Exception{
      System.out.println("hi, hi");
      test1();
  }
}