package labs_examples.generics.labs.repl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumericExampleTest {

    @Test
    void numSum() {

        NumTest numTest = new NumTest();
        double result = numTest.numSum(2, 2);
        assertEquals(4.00, result);
    }
}