package labs_examples.datastructures.stack.labs;

import java.util.Arrays;

public class customStack<T> {

    private T[] data;
    private int top;
    private int capacity;


    public customStack(int capacity) {
        data = (T[]) new Object[capacity];
        top = -1;
    }

//    public customStack(T[] data) {
//        this.data = data;
//
//    }

    public customStack(T[] data, int top) {
        this.data = data;
        this.top = top;
    }


    public customStack() {

    }

    public boolean isFull() {
        return (top == data.length - 1);
    }


    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(T value) {
        if (top > data.length * .75) {
            data = Arrays.copyOf(data, data.length * 2);
//            data = Arrays.copyOf(tmp, tmp.length);
        }
        if (!isFull()) {
            top++;
            data[top] = value;
        } else {
            throw new IndexOutOfBoundsException("Stack is full");

        }
    }

    public T pop() {
        if (top <= data.length / 4) {
            data = Arrays.copyOf(data, data.length / 2);
        }
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return data[top--];
    }


    public T top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return data[top];
    }

    public T peekFirst() {
        return data[top];
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return data[0];


    }

    public int size() {
        return top + 1;
    }

    public void print() {

        for (T s : data) {
            System.out.println(s);
        }
    }

    //@TODO HALP with #2 and #3
    public void resize() {


//        T[] old = data;
//        data = (T[]) new Object[old.length * capacity];
//        for (int i = 0; i < old.length; i++) {
//
//            old[i] = data[i];
//            }

    }


}