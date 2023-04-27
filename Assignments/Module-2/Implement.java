package Module_2;

public class Implement 
{
	 public static void main(String[] args) 
	 {
	        int[] a = new int[5];
	        try 
	        {
	            try 
	            {
	            	// This line will throw an ArithmeticException
	                a[5] = 30 / 0; 
	            } 
	            catch (ArithmeticException e) 
	            {
	                System.out.println("Caught ArithmeticException: " + e.getMessage());
	            }
	         // This line will throw an ArrayIndexOutOfBoundsException
	            a[10] = 20; 
	        } 
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	        System.out.println("Program continues to execute...");
	    }
}
