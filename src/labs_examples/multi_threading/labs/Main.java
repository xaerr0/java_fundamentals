package labs_examples.multi_threading.labs;

public class Main {
    public static void main(String[] args) {

        // Step 1: demonstrate creating a new thread using the MyRunnable class below
        System.out.println("Main Thread Start");
        MyRunnable thread1 = new MyRunnable("First Runnable");

        // Step 2: demonstrate create a new thread using the MyOtherRunnable class below

        MyOtherRunnable thread2 = new MyOtherRunnable("Second Runnable");

        System.out.println("Main Thread End");
    }

}

class MyRunnable implements Runnable {

    Thread thread;

    public MyRunnable(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + thread.getName() + "!");
    }

}

class MyOtherRunnable implements Runnable {
    Thread thread;

    public MyOtherRunnable(String name){
        thread = new Thread (this, name);
        thread.start();
    }
    @Override
    public void run(){
        System.out.println("I'm in a thread name " + Thread.currentThread().getName() + "!");
    }
}

