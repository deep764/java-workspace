package Module_2;

class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in this thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread executing: " + i);
        }
    }
}

public class Main_Runnable 
{
	 public static void main(String[] args) 
	 {
	        // Create an object of the class implementing Runnable
	        MyRunnable myRunnable = new MyRunnable();

	        // Create a Thread object passing the object of MyRunnable
	        Thread thread = new Thread(myRunnable);

	        // Start the thread
	        thread.start();
	    }
}
