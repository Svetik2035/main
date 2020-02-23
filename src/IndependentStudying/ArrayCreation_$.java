package IndependentStudying;

    public class ArrayCreation_$ {
        public static void main(String[] args) {
            // creating an array second way
           int[] ages = new int[]{3, 5, 11, 33, 57, 18};// created a new array

            int itemCount = ages.length; //created a box in memory where I will store my exact data
            System.out.println("itemCount = " + itemCount);//itemCount = 6
            // java calculated number of indexes in this particular array
            // (in our case it is 6)
            //System.out.println("ages = " + ages);// it gives some gibberish language ages = [I@12edcd21

            // creating a for loop
            for (int x = 0; x <itemCount ; x++) {
                System.out.println(ages[x]);// this loop give the same result if i accessing the elements one by one
                /**like this
                 * System.out.println( data[0]);
                 * System.out.println( data[1]);
                 * System.out.println(data[2]);
                 * System.out.println( data[3]);*/

                  //new array creation

                int [] areaCode = {703,410,300,954,665};
                for (int i = 0; i < areaCode.length ; i++) {
                    // System.out.println("areaCode = " + areaCode[i]);
                    //this will print out
                    /*areaCode = 703
                      areaCode = 410
                      areaCode = 300
                      areaCode = 954
                      areaCode = 665*/
                    System.out.println(areaCode[i] + " ");
                    // this will print:
                    /**
                     * 703
                     * 410
                     * 300
                     * 954
                     * 665
                     */


                }

            }

        }
}
