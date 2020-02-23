package day11;

class Practice_ScoreChecker {
    public static void main(String[] args) {

        int score = 100;

        if (score < 0 && score > 100) {
            System.out.println("INVALID SCORE!!!");
        } else if (score == 100) {
        System.out.println("PERFECT SCORE");
        }else if (score > 70 && score < 100){
            System.out.println("YOU HAVE PASSED!!!");
        }else{
           System.out.println("YOU HAVE FAILED!!!!");
            }
        int score2 = 58;
        if (score2 <20) {
            System.out.println("COME TO MY OFFICE!!!");
        }else if (score2 <=30 && score2 <=40) {
            System.out.println("ATTEND ADDITIONAL CLASSES");
        }else if (score2 <=40 && score2 <=70){
        System.out.println("YOU HAVE FAILED!!!!");
            System.out.println(score2 <=40 && score2 <=70);
        }else{
            System.out.println("YOU HAVE FAILED!!!!");
        }

        /*If score is less than 20-->> come to my office
        if th score between 30-40-->> Attend Additional Classes
         id score is between 40-70-->> Little bit more study will let you pass
         */




        /* create a program to check the score :ScoreChecker with main method
        create a variable called score assign a value of your choice
        if the score is less than 0 or more than 100 -->> INVALID Score!!!
        if the score is 100-->> PERFECT SCORE
        if the score is between 70 and 100 -->> YOU HAVE PASSED!
        else you have failed!!!!
        Optional: add more condition
        If score is less than 20-->> come to my office
        if th score between 30-40-->> Attend Additional Classes
         id score is between 40-70-->> Little bit more study will let you pass
         */

    }
}
