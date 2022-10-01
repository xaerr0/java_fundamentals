package labs_examples.generics.labs.exercise3_1;

/**
 * 1) Write a generic method that accepts two generic arguments. This generic method should only accept
 * arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 * numbers were passed in regardless of their type.
 */

public class GenericSum {

    public static void main(String[] args) {
        GenericSum genSum = new GenericSum();
        double a = genSum.add(4, 63.43252);
        System.out.println(a);
    }


    public <E extends Number, F extends Number> double add(E x, F y) {
        return x.doubleValue() + y.doubleValue();
    }
}