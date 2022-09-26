package labs_examples.generics.labs.repl;

public class NumTest {

    public <E extends Number, F extends Number> double numSum(E x, F y) {
        return x.doubleValue() + y.doubleValue();
    }
}