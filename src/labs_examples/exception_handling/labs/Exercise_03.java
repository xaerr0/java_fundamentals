package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        try {
            int[] num = {43, 32, 12, 0};
//            int x = num[1] / num [3];
            System.out.println(num[10]);
            //TODO Print both messages?
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("Computer Could Not Figure Out the Answer");
        }
        System.out.println("Complete");
    }
}