package Day36;

public class MethodWithParameter {
    public static void main(String[] args) {
        //addOneHundred(new Integer(100));
        addOneHundred(25);
        int num = 7;
        addOneHundred(num);

    }
    public static void addOneHundred( int x){
        x= x + 100;
        System.out.println(x);
    }

}
