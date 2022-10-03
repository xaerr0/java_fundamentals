package labs_examples.lambdas.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 * <p>
 * 1) Demonstrate the use of a static method reference
 * 2) Demonstrate the use of an instance method reference
 * 3) Demonstrate the use of a constructor reference
 */

public class Exercise_03 {


    public static void main(String[] args) {

        /**      1) Demonstrate the use of a static method reference */
        //                Lambda Expression
        BiFunction<Integer, Integer, Integer> biFunc = (x, y) -> Integer.sum(x, y);
        System.out.println(biFunc.apply(5, 3));
        //                Lambda Expression
        BiFunction<Integer, Integer, Integer> biFunc2 = (x, y) -> (x + y);
        System.out.println(biFunc2.apply(5, 3));
//                        Static Method Reference
        BiFunction<Integer, Integer, Integer> biFunc3 = Integer::sum;
        System.out.println(biFunc3.apply(5, 3));


        /**      2) Demonstrate the use of an instance method reference */
        Supplier<Integer> supplier1 = "String Test"::length;
        System.out.println(supplier1.get());


        /**      3) Demonstrate the use of a constructor reference */

        Function<String, String> function = String :: new;
        System.out.println(function.apply("Applying String..."));

        Supplier<String> supplier = String :: new;
        System.out.println("Emptiness " + supplier.get());

    }


}