package office_hour;

public class Practice_12_03 {
    public static void main(String[] args) {

        for (int jumpCount = 1; jumpCount <= 100; jumpCount++) {
            System.out.println("I jumped " + jumpCount + " times");

        }
        //stack -->>  jumpCount -> 1
        //3-rd stairs -->> 7-th
        //sing a song, drink water , clap
        for (int stairs = 3; stairs <= 7; stairs++) {
            System.out.println("sing a song");
            System.out.println("drink some water");
            System.out.println("clap");
            System.out.println("You are done  with stair " + stairs);
        }

            // from 1-10 even numbers only
            for (int num = 1; num <= 10; num++) {
                System.out.println("Print even numbers " + num);

            }

            //task: print 23 - 30
            for (int point = 23; point <= 30; point++) {
                System.out.println(point);
            }

            // I am in level 90 89 88 --- 80
            for (int level = 90; level >= 80; level--) {
                System.out.println("I am  at level " + level);

            }
            //1 --10 even numbers only
            for (int num = 1; num <=10 ; num++) {
                if(num%2 ==0){
                    System.out.print(num);

                }
            }
        for (int number = 1; number <= 10 ; number+=2) {
            System.out.println(number);
            
        }

            
        }

        }

    //int stairs = 3;
    // stairs <= 7
    /*System.out.println("sing a song");
            System.out.println("drink some water");
            System.out.println("clap");*/
    

