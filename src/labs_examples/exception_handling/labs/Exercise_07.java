package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 * <p>
 * 1) Create a custom exception.
 * 2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {

    public static void main(String[] args) {
//        using throws keyword
        exceptionTest();
    }


    public static void exceptionTest() {
        int[] myNum = {11, 57, 3};

        try {
            exceptionTest2();
        } catch (CustomExtension e) {
            System.out.println(e.toString());
        }
    }

    public static void exceptionTest2() throws ArrayIndexOutOfBoundsException {

        throw new CustomExtension();

    }

    public static class CustomExtension extends ArithmeticException {
        @Override
        public String toString() {
            return "Not gonna work bro!";
        }
    }

}




