package office_hour.Exeptions;

public class ExceptionsPractice {
    public static void main(String[] args) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Step 2");
        }

            try {
                // System.out.println(9/0);
                int[] arr = {1, 2, 3};
                System.out.println(arr[50]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index Out Of Bounds Exception is handled");
            } catch (ClassCastException e) {
                System.out.println("Class Cast Exception is handled");
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception is handled");
            } catch (IllegalStateException e) {
                System.out.println("Illegal State Exception is handled");
            } catch (Exception e) {
                System.out.println("Exception is handled");
            }
            System.out.println("Test Completed");
        }
    }
