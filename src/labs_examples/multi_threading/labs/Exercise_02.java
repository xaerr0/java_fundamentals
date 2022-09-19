package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 * <p>
 * Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {

    public static void main(String[] args) {
        FirstThread thread1 = new FirstThread("First Thread");
        SecondThread thread2 = new SecondThread("Second Thread");
        thread2.setPriority(10);

    }
}


class FirstThread extends Thread {
    FirstThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + "Starting thread");
        try {
            for (int count = 10; count > 0; count--) {
                Thread.sleep(500);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}

class SecondThread extends Thread {
    SecondThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + "Starting thread");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(500);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");

    }
}

