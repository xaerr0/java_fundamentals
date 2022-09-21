package labs_examples.multi_threading.labs.exercise_05;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        WaitNotifyDemo app = new WaitNotifyDemo();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    app.waitExample();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                }
            });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    app.notifyExample();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        }
}
