package MuhtarTraining.VideoDay6;

public class PrimitivesCasting {
    /*
	 casting: converting larger primitive to smaller size
	 	1.dataType variableName  = (dataType) value
	 	2.castings : Explicit & implicit
        3. primitives:  byte, short, int, long, float, double
	 */
    public static void main(String[] args) {
        int a = 10;
        // byte b = a;->we cannot directly assign int into byte,
        // because byte is smaller in size
        //and it will give a compiler error
        //in order to do that we need to use an explicit casting:
        byte b = (byte) a;
        System.out.println(b);//10
        /*another thing that the value should be in the right range,
         for example: int a =128;
          byte b = (byte) a;// it will print -128,
          because byte range is only between -127 to 127,
          and we cannot fit a bigger number into it.
        * */
                double decimalNumber = 10.5;
                float floatNumber = (int)decimalNumber;//double>float

        //I need to use the explicit casting
        System.out.println(floatNumber);
    }

}
