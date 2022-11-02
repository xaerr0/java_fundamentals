package labs_examples.datastructures.stack.labs;

public class customStackTest {
    public static void main(String[] args) {

        customStack<Integer> intStack = new customStack<>(10);
//
        intStack.push(2);
        intStack.push(4);
        intStack.push(5);
        intStack.push(5);
        intStack.push(5);
        intStack.push(6);
        intStack.push(10);
        intStack.push(10);
        intStack.push(15);
        intStack.push(30);

        intStack.print();
//        intStack.resize(1);
        intStack.pop();
        intStack.pop();
        intStack.pop();
        intStack.pop();
        intStack.pop();



        System.out.println("----------------------------");
        System.out.println(intStack.peekFirst());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.isEmpty());

        System.out.println(intStack.size());
        System.out.println(intStack.peekLast());

        intStack.print();




    }
}