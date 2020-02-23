package IndependentStudying;

public class Examples {

    public static void main(String[] args) {

    char [] charName = new char [8] ;
        System.out.println("<" + charName [0] +">"); //< >
        charName [0] = 'S';
        charName [1] = 'v';
        charName [2] = 'e';
        charName [3] = 't';
        charName [4] = 'l';
        charName [5] = 'a';
        charName [6] = 'n';
        charName [7] = 'a';

       // System.out.println(charName [0] + charName [1]+ charName [2]+charName [3]
                    //  + charName [4] + charName [5]+charName [6] + charName [7]);// these 8 prints, printed: 830

        System.out.print(charName [0]);
        System.out.print(charName [1]);
        System.out.print(charName [2]);
        System.out.print(charName [3]);
        System.out.print(charName [4]);
        System.out.print(charName [5]);
        System.out.print(charName [6]);
        System.out.print(charName [7]); //these 8 prints, printed my name: Svetlana

    }
}
