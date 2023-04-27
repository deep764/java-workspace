package Module_2;

class TestMultiPriority1 extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " running with priority " + Thread.currentThread().getPriority());
    }
}

public class Priority 
{
	 public static void main(String[] args) 
	 {
	        TestMultiPriority1 m1 = new TestMultiPriority1();
	        TestMultiPriority1 m2 = new TestMultiPriority1();
	        m1.setName("mythread-1");
	        m2.setName("mythread-2");
	        m1.setPriority(Thread.MIN_PRIORITY);
	        m2.setPriority(Thread.MAX_PRIORITY);
	        m1.start();
	        m2.start();
	 }
}
