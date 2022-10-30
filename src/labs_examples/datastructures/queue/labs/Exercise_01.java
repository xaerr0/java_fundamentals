package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("String 1");
        queue.add("String 2");
        queue.add("String 3");
        queue.add("String 4");
        queue.add("String 5");

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        queue.remove("String 3");
        System.out.println(queue);
        queue.offer("String 5");
        System.out.println(queue);
        queue.element();
        System.out.println(queue);
    }
}