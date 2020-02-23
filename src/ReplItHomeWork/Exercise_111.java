package ReplItHomeWork;

public class Exercise_111 {
    /*Instructions from your teacher:
      Given int variables k and total that have already been declared,
      use a do...while loop to compute the sum of the squares of the first 50 counting numbers,
      and store this value in total.
      Thus your code should put 1*1 + 2*2 + 3*3 +... + 49*49 + 50*50 into total.
      Use no variables other than k and total. Print out value of variable total.
      NO NEED FOR ARRAY HERE, JUST LOOP
   */
    public static void main(String[] args) {
        int k = 1;
        int total = 0;
        do {
        total+=(k*k);//total= total+(k*k);
        k++;//go to te next number
        }while(k<=50);// k must be less or equal 50
        System.out.println(total);
    }
}
