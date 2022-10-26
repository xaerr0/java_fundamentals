package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add() x
 *      3) addAll() x
 *      4) addFirst() x
 *      5) addLast() x
 *      6) getFirst() x
 *      7) getLast() x
 *      8) get() x
 *      9) set() x
 *      10) push() x
 *      11) pop() x
 *      12) remove() x
 *      13) contains() x
 *      14) listIterator() x
 *      15) clear() x
 */

public class Exercise_01 {

    public static void main(String[] args) {
        // 1) create a LinkedList (from Java's libraries)
        LinkedList<String> myList = new LinkedList<>();

        // 2) add()
        myList.add("add 1");
        myList.add("add 2");
        myList.add("add 3");

        // 3) addAll()
        Collection<String> collection = new ArrayList<>();
        collection.add("collect 1");
        collection.add("collect 2");
        collection.add("collect 3");
        myList.addAll(collection);

        //print with add() and addAll()
        System.out.println(myList);

        // 4) addFirst()
        myList.addFirst("To Front");
        myList.addFirst("Now To Front");
        System.out.println(myList);

        // 5) addLast()
        myList.addLast("To Last");
        myList.addLast("Now To Last");

        // 6) getFirst()
        System.out.println(myList.getFirst());

        // 7) getLast()
        System.out.println(myList.getLast());

        // 8) get()
        System.out.println(myList.get(3));

        // 9) set()
        myList.set(3, "Replacing with set() method");
        myList.set(5, "ALSO Replacing with set() method");
        System.out.println(myList);

        // 10) push()
        myList.push("Pushing to front");
        myList.push("Now pushing to front");
        System.out.println(myList);

        // 11) pop()
        String pop = myList.pop();
        // printing popped element
        System.out.println(pop);
        // print list with popped element removed
        System.out.println(myList);

        // 12) remove()
        myList.remove(7 );
        System.out.println(myList);

        // 13) contains()
        System.out.println("Does the list contain 'add 1'? " + myList.contains("add 1"));

        // 14) listIterator()
        Iterator iterator = myList.iterator();

        System.out.println("\nElements in LinkedList: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 15) clear()
        myList.clear();
        System.out.println(myList + "     After clear() method, tis empty!");



    }
}