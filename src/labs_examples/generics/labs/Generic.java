package labs_examples.generics.labs;

import java.lang.reflect.Array;

/**
 * Write a generic class called 'Generic'.
 * <p>
 * Inside that class create a public non-static method called printArray() that receives a generic array as a
 * parameter and prints its contents to the console one line at a time.
 */

class Generic <T> {

    public void printArray (T[] genericArray) {
        for (T item : genericArray) {
            System.out.println(item);
        }
    }
}