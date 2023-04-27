package Module_2;

class TestThreadTwice1 extends Thread 
{
    public void run() 
    {
        System.out.println("Thread running");
    }
}

public class Thread_twice_calling_start 
{
	 public static void main(String[] args) 
	 {
	        TestThreadTwice1 t1 = new TestThreadTwice1();
	        t1.start();
	        t1.start();
	 }
}
