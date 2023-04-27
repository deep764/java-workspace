package Module_2;

public class Demonstrate_Multiple 
{
	 public static void main(String[] args) 
	 {
	        int[] a = new int[5];
	        try 
	     // This line will throw both ArrayIndexOutOfBoundsException and ArithmeticException
	        {
	            a[5] = 30 / 0; 
	        } 
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	        }
	        catch (ArithmeticException e) 
	        {
	            System.out.println("Caught ArithmeticException: " + e.getMessage());
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	        System.out.println("Program continues to execute...");
	    }
}
