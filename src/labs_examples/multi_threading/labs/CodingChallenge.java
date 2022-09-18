package labs_examples.multi_threading.labs;

public class CodingChallenge {
    /**
     * Implement the Runnable interface
     *
     * Methods to use:
     *
     * super();
     * start();
     * Thread.sleep();
     *
     */
    public static void main(String[] args) {
    MultiThreading thread1 = new MultiThreading();

    }

    static class MultiThreading implements Runnable {

        /* 1. Create a reference to Thread */

        Thread thread;


        MultiThreading() {
            //2. Initialize the thread reference with a parameter of 'this'
//            super();
            thread = new Thread(this);
            //3. Start the thread.
            thread.start();
        }
        // 4.Override the run() method
        @Override
        public void run() {

            //5. Make run() print 'Hello Multithreading 10 times, once every 100ms'
            try {
                for (int i = 0; i < 10; i ++) {
                    Thread.sleep(100);
                    System.out.println("Hello Multithreading");
                }

            //6. Catch any InterruptedExceptions
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
