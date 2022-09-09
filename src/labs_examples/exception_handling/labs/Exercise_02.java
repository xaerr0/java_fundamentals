package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 * <p>
 * Demonstrate a try/catch with multiple catch statements.
 */


public class Exercise_02 {

    public static void main(String[] args) {


        try {
            int[] num = {43, 32, 12, 0};
//            int x = num[1] / num [3];
            System.out.println(num[10]);
            System.out.println(num[0] / num[3]);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Complete");
    }
}