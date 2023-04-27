package Module_2;

class Thread1 extends Thread 
{
    public void run() 
    {
        // Code to be executed in this thread
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Thread executing: " + i);
        }
    }
}

public class Main_one_thread 
{
	  public static void main(String[] args) 
	  {
	        // Create an object of the MyThread class
	        Thread1 myThread = new Thread1();

	        // Start the thread
	        myThread.start();
	  }
}
