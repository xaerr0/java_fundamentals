package labs_examples.multi_threading.labs;

public class Main2 {
    public static void main(String[] args) {

            // Step 1) demonstrate creating a new Thread using the MyThread class below
        MyThread thread1 = new MyThread("First Thread");

            // Step 2) demonstrate creating (and starting) a new Thread using the MyOtherThread class below
        MyOtherThread thread2 = new MyOtherThread("Second Thread");

        }
    }

    class MyThread extends Thread {

        public MyThread(String name){
            super(name);
            start();
        }

        @Override
        public void run(){
            System.out.println("I'm in a thread name " + getName() + "!");
        }
    }

    class MyOtherThread extends Thread {

        public MyOtherThread(String name) {
            super(name);
            start();
        }

        @Override
        public void run(){
            System.out.println("I'm in a thread name " + getName() + "!");
        }
    }

