package labs_examples.datastructures.linkedlist.repl;

import java.util.LinkedList;

public class LinkedListRepl {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();

        // demonstrate adding several elements to the LinkedList

        myList.add("Adding");
        myList.add("Elements");
        myList.add("To");
        myList.add("LinkedList");
        System.out.println("LinkedList = " + myList);


        // demonstrate retrieving one or more element from the LinkedList

        System.out.println("Specific element = " + myList.get(3));

        // demonstrate removing several elements from the LinkedList

        myList.remove(0 );
        myList.remove(1 );
        System.out.println("After removing index 0 and 1 = " + myList);

        // demonstrate at least 4 additional method calls against the LinkedList

        //create second LinkedList then clone
        LinkedList<String> myListClone = new LinkedList();
        myListClone = (LinkedList) myList.clone();
        System.out.println("Cloned LinkedList = " + myListClone);

        //clear LinkedList
        myList.clear();
        System.out.println("clear method = " + myList);

        //get size of LinkedList
        System.out.println("LinkedList clone size = " + myListClone.size());

        //replace element
        System.out.println("Replace element = " + myListClone.set(0, "Awesome"));
        System.out.println(myListClone);

    }
}