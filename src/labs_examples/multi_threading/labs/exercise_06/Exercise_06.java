package labs_examples.multi_threading.labs.exercise_06;

/**
 * Multithreading Exercise 6:
 * <p>
 * Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 * print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */


public class Exercise_06 {
    public static void main(String[] args) {
        EvenRunnable evenRunnable = new EvenRunnable();
        OddRunnable oddRunnable = new OddRunnable();
        Thread thread1 = new Thread(oddRunnable, "Odd Count");
        Thread thread2 = new Thread(evenRunnable, "Even Count");
        thread1.start();
        thread2.start();
    }
}

class EvenRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        synchronized (this) {
            try {
                for (int count = 2; count <= 100; count++) {
                    notifyAll();
                    if (count % 2 == 0) Thread.sleep(300);
                    System.out.println(Thread.currentThread().getName() + ", count is " + count);
                    wait();
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
            System.out.println(Thread.currentThread().getName() + " terminating.");
        }
    }
}

class OddRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        synchronized (this) {
            try {
                for (int count = 1; count <= 100; count++) {
                    notifyAll();
                    if (count % 2 != 0) Thread.sleep(300);
                    System.out.println(Thread.currentThread().getName() + ", count is " + count);
                    wait();
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
            System.out.println(Thread.currentThread().getName() + " terminating.");
        }
    }
}