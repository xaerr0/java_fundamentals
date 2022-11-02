package labs_examples.datastructures.linkedlist.labs;


public class CustomLinkedList<T> {

    private Node head;


    public CustomLinkedList(T... data) {

        if (data.length < 1) {
            head = null;
        } else {
            for (T item : data) {
                addFirst(item);
            }
        }

    }

    public static void main(String[] args) {
        CustomLinkedList<String> customLL = new CustomLinkedList<>();

        customLL.addFirst("Test");
        customLL.addFirst("for");
        customLL.addFirst("custom");
        customLL.addLast("Linked");
        customLL.addLast("List");
        customLL.addFirst("AddFirst");

        customLL.print();
        System.out.println(customLL.size());
//
        boolean wordCheck = customLL.contains("Linked");
        System.out.println("Does the list contain the word 'Linked'? = " + wordCheck);
        boolean wordCheck2 = customLL.contains("Candy");
        System.out.println("wordcheck for Candy = " + wordCheck2);

        customLL.popFront();
        customLL.print();

        customLL.remove("for");
        customLL.print();

        System.out.println();



    }

    private void addFirst(T data) {
        if (isEmpty()) {
            head = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        }
    }


    private void addLast(T data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node iterator = head;

            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = new Node<>(data);
        }
    }

    private T popFront() {
        if (isEmpty()) {
            return null;
        }
        Node returnValue = head;
        head = head.next;
        return (T) returnValue.data;
    }

    public T get(int index) {

        int count = 0;

        Node iterator = head;

        while (count != index) {
            iterator = iterator.next;
            count++;
        }
        return (T) iterator.data;
    }

    private void remove(T data) {
        // list is empty with nothing to delete
        if (isEmpty()) {
            return;
        }
        // the item to delete is first element in linked list
        if (head.data == data) {
            popFront();
        } else {
            // not the first element, start iterating - don't modify "head" EVER
            Node iterator = head;

            // because we may need to delete from the middle or end of the list
            // we want to track previous node
            Node previous = null;

            // start iterating until we find data or reach end of the list
            while (iterator.data != data && iterator.next != null) {
                previous = iterator;
                iterator = iterator.next;
            }

            // when we exit while loop we have found data or the end of the list

            // if it's the end of the list and the data doesn't match - 404 not found
            if (iterator.next == null && iterator.data != data) {
                System.out.println("The data you're trying to delete does not exist");
                return;
                // if we found the end of the list and the data matches, delete last element
            } else if (iterator.next == null && iterator.data == data) {
                previous.next = null;
                // otherwise, we found data in the middle of the list and need to delete it
            } else {
                previous.next = iterator.next;
            }
        }
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

    private int size() {
        int count = 0;

        if (isEmpty()) {
            return count;
        }
        Node iterator = head;
        count++;

        while (iterator.next != null) {
            iterator = iterator.next;
            count++;
        }
        return count;
    }

    private boolean contains(T data) {
        if (isEmpty()) {
            return false;
        }
        Node iterator = head;
        if (iterator.data == data) {
            return true;

        }
        while (iterator.next != null) {
            iterator = iterator.next;

            if (iterator.data == data) {
                return true;

            }
        }
        return false;
    }


    private boolean isEmpty() {
        return head == null;
    }
}