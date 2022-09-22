package labs_examples.generics.labs.repl;

public class Repl3 {
    class Main {
        public static void main(String[] args) {

            // Step 1) create the generic method as instructed in the NumericExample class

            // Step 2) call that method and pass two doubles
            NumericExample numExample = new NumericExample();

            // Step 3) call that method and pass two ints

            // Step 4) call that method and pass two floats

            // Step 5) call that method and pass one int and one double


        }
    }

    static class NumericExample {

        // write a generic method below that will return the sum of ANY two numeric values (no matter
        // what their specific data type is) (but remember the values must be Numeric)

        public static <E extends Number> int numSum(int x, int y){

            return x + y;

        }



    }
}