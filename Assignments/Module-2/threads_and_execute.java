package Module_2;

class TestSleep1 extends Thread 
{
    public void run() 
    {
        try 
        {
            System.out.println("Thread " + Thread.currentThread().getName() + " started");
            Thread.sleep(2000);
            System.out.println("Thread " + Thread.currentThread().getName() + " finished");
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}

public class threads_and_execute 
{
	  public static void main(String[] args) 
	  {
	        TestSleep1 t1 = new TestSleep1();
	        TestSleep1 t2 = new TestSleep1();
	        t1.start();
	        t2.start();
	  }
}
