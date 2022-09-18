package labs_examples.multi_threading.labs;

public class CodingChallenge2 {
    /**
     * Implement the Runnable interface
     * <p>
     * Methods to use:
     * <p>
     * super();
     * start();
     * Thread.sleep();
     */

    class MultiThreading extends Thread {

        // Constructor
        MultiThreading() {
            // 1. Call the constructor in the parent class
            super();
            // 2. Start the thread
            start();

        }

        // 3. Override the "public void run()" method from the parent Thread class
        @Override
        public void run() {
        // 4. Print "Hello MultiThreading!" every 200 ms, 5 times.
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(200);
                    System.out.println("Hello Multithreading");
                }
        // 5. Catch any InterrupedExceptions.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
    }
}