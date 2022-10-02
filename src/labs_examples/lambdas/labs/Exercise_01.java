package labs_examples.lambdas.labs;

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

    public static void main(String[] args) {
//         * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters
//         and returns void
        FuncInterfaceVoid sayMsg = () -> System.out.println();
        sayMsg.abstractMethod();

        FuncInterfaceOneParameter say = (s) -> "Hello";

        FuncInterfaceOneParameter oneParameter = new FuncInterfaceOneParameter() {
            @Override
            public String message(String s) {
                return "Howdy doody!";
            }
        };


//        2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
// * an anonymous inner class from this interface.

        FuncInterfaceVoid abstractMethod = new FuncInterfaceVoid() {
            @Override
            public void abstractMethod() {
            }
        };
    }


    @FunctionalInterface
    interface FuncInterfaceVoid {
        void abstractMethod();
        }

    @FunctionalInterface
    interface FuncInterfaceOneParameter {
        String message (String s);
    }
}