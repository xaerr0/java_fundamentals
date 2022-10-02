package labs_examples.lambdas.labs;

import java.time.LocalDateTime;
import java.util.function.BiPredicate;
import java.util.function.DoubleBinaryOperator;


/**
 * Lambdas Exercise 2:
 * <p>
 * 1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 * 10 of them! You can do it! You'll know so much about them when you're done!
 */


public class Exercise_02 {
    public static void main(String[] args) {
        // 1) Predicate<T> / boolean test (T t);
        System.out.println("------Predicate examples------");
        Predicate<String> predicate = str -> str.equals("abc");
        Predicate<String> predicate2 = str -> str.equals("abc");
        boolean result = predicate.test("abc");
        boolean result2 = predicate2.test("def");
        System.out.println(result);
        System.out.println(result2);

        // 2) Supplier<T> / T Get();
        System.out.println("\n------Supplier examples------");
        Supplier<LocalDateTime> suppler = () -> LocalDateTime.now();
//        Supplier<LocalDateTime> suppler = LocalDateTime::now;
        System.out.println(suppler.get());

        // 3) UnaryOperator<T> / T apply(T t); //@TODO more examples?
        System.out.println("\n------Unary Operator examples------");
        UnaryOperator<Integer> unaryOp = x -> x * 10;
        System.out.println(unaryOp.apply(2));
        System.out.println(unaryOp.apply(4));

        // 4) BiFunction<T, U, R> / R apply(T t, U u);
        System.out.println("\n------BiFunction examples------");
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> (a + b);
        BiFunction<Integer, Integer, String> biFunction2 = (a, b) -> ("Example with String Parameter: " + a + b);
        int biFunctResult = biFunction.apply(4, 6);
        String biFunctResult2 = biFunction2.apply(4, 6);
        System.out.println(biFunctResult);
        System.out.println(biFunctResult2);

        // 5) Consumer<T> / void accept(T t);
        System.out.println("\n------Consumer examples------");

        Consumer<String> consumer = (t) -> System.out.println("Value is " + t);
        Consumer<String> consumer2 = (t) -> System.out.println("Second Value is " + t);
        consumer.accept("String Test");
        consumer2.accept("String Test 2");

        // 6) BinaryOperator<T, U, R> / R apply(T t, U u);
        System.out.println("\n------BinaryOperator examples------");
        BinaryOperator<Integer, Integer, Integer> binaryOp = (x1, x2) -> x1.compareTo(x2) * x2;
        System.out.println(binaryOp.apply(5, 7));

        // 7) BinaryOperator<T, U, R> / R apply(T t, U u);
        System.out.println("\n------BiPredicate examples------");
        BiPredicate<String, String> biPred = (str1, str2) -> str1.equals(str2);
        System.out.println(biPred.test("poop", "poop"));
    }


    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    @FunctionalInterface
    public interface UnaryOperator<T> {
        T apply(T t);
    }

    @FunctionalInterface
    public interface BiFunction<T, U, R> {
        R apply(T t, U u);

    }

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    @FunctionalInterface
    public interface BinaryOperator<T, U, R> {
        R apply(T t, U u);

    }

}