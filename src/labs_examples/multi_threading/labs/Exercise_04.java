package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 * <p>
 * Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 * working as expected
 */


public class Exercise_04 {

    public static void main(String[] args) {
        Count count = new Count();
        FirstThread t1 = new FirstThread(count);
        SecondThread t2 = new SecondThread(count);
        t1.start();
        t2.start();
    }

    static class Count {
        synchronized void printCount(int c) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(c * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class FirstThread extends Thread {
        Count c;

        FirstThread(Count c) {
            this.c = c;

        }

        public void run() {
            c.printCount(100);
        }
    }

    private static class SecondThread extends Thread {
        Count c;

        SecondThread(Count c) {
            this.c = c;

        }

        public void run() {
            c.printCount(500);
        }

    }
}