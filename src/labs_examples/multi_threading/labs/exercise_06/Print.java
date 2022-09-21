package labs_examples.multi_threading.labs.exercise_06;

public class Print {
    public static void main(String[] args) {
        Print print = new Print();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    print.even();
                } catch (InterruptedException e) {
                }
            }
        }, "Even Runnable");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    print.odd();
                } catch (InterruptedException e) {
                }
            }
        }, "Odd Runnable");


        thread1.start();
        thread2.start();
    }


    public synchronized void even() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " starting.");
        for (int count = 0; count <= 100; count = count + 2) {
            notifyAll();
            System.out.println(Thread.currentThread().getName() + ", count is " + count);
            wait();
        }
    }

    public synchronized void odd() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " starting.");
        for (int count = 1; count <= 100; count = count + 2) {
            notifyAll();
            System.out.println(Thread.currentThread().getName() + ", count is " + count);
            wait();
        }
    }
}



