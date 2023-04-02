package Module_2;
abstract class Parent 
{
    // abstract message method
    public abstract void message();
}

// first subclass of Parent
class FirstSubclass extends Parent 
{
    // implementation of message method
    public void message() 
    {
        System.out.println("This is first subclass");
    }
}

// second subclass of Parent
class SecondSubclass extends Parent 
{
    // implementation of message method
    public void message() 
    {
        System.out.println("This is second subclass");
    }
}
public class Creating_an_object 
{
	 public static void main(String[] args) 
	 {
	        // create objects of each subclass
	        Parent firstObj = new FirstSubclass();
	        Parent secondObj = new SecondSubclass();

	        // call the message method of each object
	        firstObj.message();   
	        secondObj.message();  
	 }
}
