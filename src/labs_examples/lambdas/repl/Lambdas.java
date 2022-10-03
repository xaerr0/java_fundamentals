package labs_examples.lambdas.repl;

public class Lambdas {


    public static void main(String[] args) {

        // Step 1) Create a lambda expression using the interface below
        LambdaExample obj1 = (a, b) -> (a + b);

        // Step 2) call the apply() method on the lambda object
        System.out.println(obj1.apply(4, 10));

        // Step 3) redefine the lambda
        obj1 = (int a, int b) -> (a * b);

        // Step 4) call the apply() method again
        System.out.println(obj1.apply(9, 15));
    }

}
interface LambdaExample {
    public int apply(int a, int b);
}