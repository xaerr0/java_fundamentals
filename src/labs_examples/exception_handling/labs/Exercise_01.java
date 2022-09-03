package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
public class Exercise_01 {

    public static void main(String[] args) {

        int[] num = {43, 32, 12};

        try {
            System.out.println(num[5]);
        } catch (Exception e) {
            System.out.println("Array Index Out of Bounds!");
        }

    }
}
