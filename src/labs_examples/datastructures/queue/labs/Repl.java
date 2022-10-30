package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

public class Repl {
    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue<>();


        // add several elements to the myQueue
        myQueue.add("Adding");
        myQueue.add("String");
        myQueue.add("Elements");
        myQueue.add("to");
        myQueue.add("Queue");

        //@TODO Supposed to be natural order?
        // print out every element in this myQueue
        System.out.println(myQueue);


        // why did they print out in the order they did
        //ANSWER: All elements in a PriorityQueue are ordered in their natural order

        // pop the first element off the myQueue
        myQueue.remove();


        // print out every element again
        System.out.println(myQueue);

        // demonstrate several other PriorityQueue methods

        for (String s : myQueue) {
            System.out.println(s);
        }

        String e1 = myQueue.element();
        System.out.println(e1);

        myQueue.clear();
    }
}