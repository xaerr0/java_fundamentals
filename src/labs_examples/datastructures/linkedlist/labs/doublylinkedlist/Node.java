package labs_examples.datastructures.linkedlist.labs.doublylinkedlist;

public class Node<T> {

    T data;
    Node next;
    Node previous;

    public Node (T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

}