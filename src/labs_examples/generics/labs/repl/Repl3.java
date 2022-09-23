package labs_examples.generics.labs.repl;

public class Repl3 {

    public static void main(String[] args) {

        // Step 1) create the generic method as instructed in the NumericExample class

        // Step 2) call that method and pass two doubles
        double a = NumericExample.numSum(4.321, 5.678);
        System.out.println(a);

        // Step 3) call that method and pass two ints
        double b = NumericExample.numSum(6, 10);
        System.out.println(b);

        // Step 4) call that method and pass two floats
        double c = NumericExample.numSum(44.5f, 28.2f);
        System.out.println(c);

        // Step 5) call that method and pass one int and one double
        double d = NumericExample.numSum(4, 4.437);
        System.out.println(d);
    }
}
class NumericExample {

    // write a generic method below that will return the sum of ANY two numeric values (no matter
    // what their specific data type is) (but remember the values must be Numeric)

    public static <E extends Number, F extends Number> double numSum(E x, F y) {
        return x.doubleValue() + y.doubleValue();
    }
}