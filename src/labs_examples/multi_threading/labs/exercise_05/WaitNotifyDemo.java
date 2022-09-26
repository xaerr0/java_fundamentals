package labs_examples.multi_threading.labs.exercise_05;

import java.util.Scanner;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

public class WaitNotifyDemo {
    public void waitExample() throws InterruptedException {
        synchronized (this) {
            System.out.println("Thread running...");
            wait();
            System.out.println("Resumed.");
        }
    }

    public void notifyExample() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(3000);
        synchronized (this) {
            System.out.println("Waiting for return key.");
            scanner.nextLine();
            System.out.println("Return key pressed.");
            notify();
        }
    }
}