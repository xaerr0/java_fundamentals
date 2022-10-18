package labs_examples.lambdas.labs;
//@TODO Still need to finish

/**
 * Lambdas Exercise 1:
 * <p>
 * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * 2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 * value of the same type as the parameter
 * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 * value
 * 6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */


public class Exercise_01 {

    public static void main(String[] args)  {
        //        2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
// * an anonymous inner class from this interface

        Runnable r1 = new Runnable() {
            @Override
            public void run() { // anonymous class
                System.out.println("Runnable with Anonymous Class");
            }
        };
        Runnable r2 = () -> {   // lambda expression
            System.out.println("Runnable with Lambda Expression");
        };
        //@TODO Why no work??
//        new Thread(r1).start();
//        new Thread(r2).start();


//        * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
// * an anonymous inner class from this interface.
        int y = 3;
        SquareRoot s = (int x) -> x * x;
        int result = s.calculate(y);
        System.out.println(result);

    }

}
//* 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
// * value of the same type as the parameter
@FunctionalInterface
interface SquareRoot {
    int calculate (int x);
}