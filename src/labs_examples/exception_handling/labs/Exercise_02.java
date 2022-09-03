package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 * <p>
 * Demonstrate a try/catch with multiple catch statements.
 */


public class Exercise_02 {

    public static void main(String[] args) {


        try {
            int[] num = {43, 32, 12, 0};
//            int x = num[1] / num [3];
            System.out.println(num[10]);
            //TODO Print both messages?
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("Complete");
    }
}