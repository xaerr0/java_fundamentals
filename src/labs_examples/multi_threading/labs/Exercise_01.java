package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 * <p>
 * 1: Create an application that starts a Thread by implementing the Runnable interface
 * 2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 */

public class Exercise_01 {

    public static void main(String[] args) {

        FirstRunnable thread1 = new FirstRunnable("First Runnable");

//        create the Thread and Runnable on the fly, pass in the name and start it all on one line
        new Thread(new MySecondRunnable(), "Second Runnable").start();


    }

    static class MySecondRunnable implements Runnable {


        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + " run() method");
            try {
                for (int count = 0; count < 10; count++) {
                    Thread.sleep(700);
                    System.out.println("In " + Thread.currentThread().getName() + ", count = " + count);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
            System.out.println(Thread.currentThread().getName() + " terminating.");

        }
    }
}


class FirstRunnable implements Runnable {


    Thread thread;

    public FirstRunnable(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " run() method");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(700);
                System.out.println("In " + Thread.currentThread().getName() + ", count = " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");

    }
}