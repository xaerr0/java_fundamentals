package labs_examples.generics.labs;

import java.lang.reflect.Array;

/**
 * Generics Exercise 1:
 * <p>
 * 1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 * 2.) Create a few objects of your generic class with different data types to demonstrate it's
 * dynamic usage.
 */


public class Exercise_01 {
    public static void main(String[] args) {

        GenericsExample<String> gen1 = new GenericsExample("String 1", "String 2");
        System.out.println(gen1.getVal1());
        System.out.println(gen1.getVal2());

        GenericsExample<Integer> gen2 = new GenericsExample<>(55, 77);
        System.out.println(gen2.getVal2());
        System.out.println(gen2.getVal1());


    }
}

class GenericsExample<T> {
    private T val1;
    private T val2;

    public GenericsExample(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }
}