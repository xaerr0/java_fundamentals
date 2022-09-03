package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 * <p>
 * Demonstrate throwing an exception in one method and catching it in another method.
 */

public class Exercise_06 {

    public static void main(String[] args) {
//        using throws keyword
        exceptionTest2();
    }


    public static void exceptionTest() throws ArrayIndexOutOfBoundsException {
        int[] myNum = {11, 57, 3};

        try {
            int x = myNum[15];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exceptionTest2() throws ArrayIndexOutOfBoundsException {
        exceptionTest();
    }

}