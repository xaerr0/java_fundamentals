package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 * Demonstrate a nested try/catch.
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int[] num = {43, 32, 12, 0};


        try {
            int x = num[1] / num[3];
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Can't divide by zero");
            try {
                System.out.println(num[10]);
            } catch (ArrayIndexOutOfBoundsException f) {
                System.out.println("\n" + f.getMessage());
                System.out.println("Array out of bounds");
            }


        }

    }
}