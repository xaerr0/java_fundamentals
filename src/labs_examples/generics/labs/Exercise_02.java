package labs_examples.generics.labs;

import java.util.ArrayList;


/**
 * Generics Exercise 2:
 * <p>
 * Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 * Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        ArrayList<Number> numList = new ArrayList<>();
        numList.add(6);
        numList.add(7);
        numList.add(10);
        System.out.println(demo.listSum(numList));
    }

    public <T extends Number> double listSum(ArrayList<T> x) {
        double sum = 0;
        for (Number number : x) {
            sum += number.doubleValue();
        }
        return sum;
    }
}