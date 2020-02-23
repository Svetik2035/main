package Office_hour_01_27_2020.Office_Hour;

public class This_Super_KeyWord {

    class Test {

        public Test() {
            System.out.println("Hola");
        }

        public Test(int a) {
            this();

            System.out.println("hello");
        }
    }

        public static void main(String[] args) {
       // Test obj = new Test();

    }
    int a = 100;
    public void method1(){
        System.out.println((this.a));// calling instance variables
    }
    public void method2(){
        this.method1();// calling instance method
    }

    }


