package Udemy_Training;

public class LoopsVideo_8 {
    public static void main(String[] args) {
       /* for (int i = 0; i <10 ; i++) {
            System.out.print(i);//printing 0123456789


        }
        System.out.println("\n");
        for (int i = 100; i >0 ; i-=10) {
            System.out.print(i + " " );
        }*/
       /* int j = 0;
        while(j<20) {
            System.out.println(j);
            j +=2;
        }*/
         boolean isTrue = true;
         int j = 0;
         while(j < 100) {
             j += 1;
            if(j % 2 ==0)// remove all the numbers that divided by 2
                continue;
            System.out.println(j);//print only odd numbers out of this loop


        }
    }

}
