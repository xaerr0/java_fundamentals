package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("push 1");
        stack.push("push 2");
        stack.push("push 3");

        System.out.println(stack);


        System.out.println("Is the current stack empty? = " + stack.empty());

        System.out.println("Peeking at the top of the stack: " + stack.peek());

        System.out.println(stack.search("push 2"));

        stack.pop();
        stack.pop();

        System.out.println("After 2 pop()'s!" + stack);
    }
}