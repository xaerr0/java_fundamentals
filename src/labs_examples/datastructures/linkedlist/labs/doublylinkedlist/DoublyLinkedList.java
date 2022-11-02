package labs_examples.datastructures.linkedlist.labs.doublylinkedlist;

public class DoublyLinkedList<T> {

    private Node head;
    private Node tail;


    public static void main(String[] args) {
        DoublyLinkedList<String> dll = new DoublyLinkedList<>();

        dll.add("first");
        dll.add("second");
        dll.addFirst("third");
        dll.addLast("Last!");
        dll.print();

    }
    private void add(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            head.previous = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        tail.next = null;
    }

    private void addFirst(T data) {

        Node newNode = new Node(data);
        head.previous = newNode;
        newNode.next = head;
        newNode.previous = null;
        head = newNode;
    }

    private void addLast(T data) {
        Node newNode = new Node(data);
        Node last = head;

        newNode.next = null;
        if (isEmpty()) {
            newNode.previous = null;
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.previous = last;
    }

    private void print() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }
        Node iterator = head;
        System.out.println(iterator.data);
        while (iterator.next != null) {
            iterator = iterator.next;
            System.out.println(iterator.data);
    }
}



    private boolean isEmpty() {
        return head == null;

    }


}