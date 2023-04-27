package Module_2;

public class DaemonThreadExample {
    public static void main(String[] args) {
        // Create the first thread
        Thread thread1 = new MyThread("Thread 1");

        // Create the second thread
        Thread thread2 = new MyThread("Thread 2");

        // Set thread1 as a daemon thread
        thread1.setDaemon(true);

        // Start both threads
        thread1.start();
        thread2.start();

        // Check if thread1 is a daemon thread
        if (thread1.isDaemon()) {
            System.out.println("Thread 1 is a daemon thread.");
        } else {
            System.out.println("Thread 1 is not a daemon thread.");
        }

        // Check if thread2 is a daemon thread
        if (thread2.isDaemon()) {
            System.out.println("Thread 2 is a daemon thread.");
        } else {
            System.out.println("Thread 2 is not a daemon thread.");
        }
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
