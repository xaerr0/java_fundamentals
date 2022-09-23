package labs_examples.generics.labs.repl;

import java.util.Arrays;

public class Repl2 {
    public static void main(String[] args) {
        // Step 1) create an array of 5 stings then call the printArray() method and pass the String array
        String[] stringArray = {"coffee", "eggs", "bacon", "sausage", "potatoes"};
        System.out.println(Arrays.toString(stringArray));
        // Step 1) create an array of 5 ints then call the printArray() method and pass the int array
        Integer[] intArray = {5, 2, 66, 4, 123};
        System.out.println(Arrays.toString(intArray));
        // Step 1) create an array of 5 doubles then call the printArray() method and pass the double array
        Double[] doubleArray = {1.4, 1.6, 2.7, 5.4, 0.3};
        System.out.println(Arrays.toString(doubleArray));
    }





    public <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}