package Day34;

public class ParsingPractice {
    public static void main(String[] args) {
        String sentence
                // 0    1   2   3     4   5    6    7    8    9
                = "I bought 3 tomato and the price was 3,14 each";
        //
        // How much is your final checkout price ?
        // HINT :
        // The count is always 3rd word
        // The price is always at 2nd word from the last
        // LOGIC : split by space, parse count and price, do calculation

        /*
         * Integer.parseInt("numberHere")
         *    it return an int value converted from String
         *
         * Integer.valueOf("numberHere")
         *  it return an Integer Object by wrapping up the number
         *
         * YOU MAY USE WHICHEVER YOU WANT BECAUSE :
         * Auto-boxing and Auto-unboxing will take care of the conversion anyway
         * */



        String[] allWords = sentence.split(" ");
        //int count = Integer.parseInt(allWords[2]);
        int count = Integer.valueOf(allWords[2]);
        // getting the last element of any array we use index length-1
        // getting the second last element of any array we use index length-2
        String priceString = allWords[allWords.length - 2];
        priceString = priceString.replace(",", ".");
        double price = Double.parseDouble(priceString);
        System.out.println("Total price is " + (count * price));


    }

}


          //index of element of array
        //                 0  1     2    3      4   5   6     7    8    9
       // String sentence = "I bought 3 tomatoes and the price was 3.14 each";
        // How much is your final checkout price
        //HINT:
        // The count is always 3rd word
        // The price is always at 2nd word from the last

       /* String[] arr= sentence.split(" ");
        float b=Float.parseFloat(arr[2]);
        float c=Float.parseFloat(arr[arr.length-2]);
        System.out.println(b*c);*/


      /*  String [] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords [2]);
        double price = Double.parseDouble(allWords [allWords .length-2]);
        double sum = count*price;
        System.out.println("sum = " + sum);*/




