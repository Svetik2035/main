package IndependentStudying;

public class TryOut1 {
    public static void main(String[] args) {
        String name= "Svetlana Gorokhova";
        int charCount = name.length();
        System.out.println("charCount = " + charCount);

        int lastCharIndex =charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        for (int x = 0; x <=lastCharIndex ; x++) {
            System.out.print(name.substring(x, x+1));
        }
        System.out.println("--------------");
        System.out.println("----------- 2 char -------------");
        for (int x = 0; x <=lastCharIndex-1 ; x++) {
          // String twoChar =name.substring(x, x+2);
           // System.out.print(twoChar + " ->");
            System.out.println(name.substring(x, x+2));
        }
        System.out.println("---------------");
        System.out.println("---------- 3 Char -----------------");

        for (int x = 0; x <=lastCharIndex-2 ; x++) {
            String threeChar = name.substring(x, x+3);
            System.out.print(threeChar+ " ");


        }

    }
}
