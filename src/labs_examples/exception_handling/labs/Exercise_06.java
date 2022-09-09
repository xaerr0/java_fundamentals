package labs_examples.exception_handling.labs;
//TODO

/**
 * Exception Handling Exercise 6:
 * <p>
 * Demonstrate throwing an exception in one method and catching it in another method.
 */

public class Exercise_06 {


    public static void main(String[] args) {
//        using throws keyword
        try {
            exceptionTest2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void exceptionTest() throws ArrayIndexOutOfBoundsException {
        int[] myNum = {11, 57, 3};
        int x = myNum[15];
    }

    public static void exceptionTest2() throws ArrayIndexOutOfBoundsException {
        exceptionTest();
    }


}
