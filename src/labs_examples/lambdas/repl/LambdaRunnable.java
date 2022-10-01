package labs_examples.lambdas.repl;

public class LambdaRunnable {

    public static void main(String[] args) {
        demoRunnable();
    }

    public static void demoRunnable() {
        // Step 1) declare a Lambda expression using the Runnable interface
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Runnable 1 test " + i);
            }
        };

        // Step 2) declare a new Thread object and pass in the Runnable Lambda
        Thread t = new Thread(runnable);

        // Step 3) start the thread
        t.start();
    }
}