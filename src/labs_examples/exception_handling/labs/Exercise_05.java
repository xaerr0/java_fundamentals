package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 * <p>
 * Demonstrate how to throw an exception.
 */

class Example {

    public static void main(String[] args) {

//       using throw keyword
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        checkAge(16);
        checkAge(21);

    }

    //               using throw keyword
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You must be at least 21 years old.");
        } else {
            System.out.println("Welcome in!");
        }
    }


}