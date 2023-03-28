package Module_2;

public class Different_data_type_method 
{
	// write a variable int,float,double,char,long,short,
	//byte,boolean
	 public static void printn(int n) 
	 {
		 System.out.println("Printing an int:"+n);
	 }
	    
	 public static void printn(float n) 
	 {
		 System.out.println("Printing a float:"+n);
	 }
	    
	 public static void printn(double n) 
	 {
		 System.out.println("Printing a double:"+n);
	 }
	    
	 public static void printn(long n) 
	 {
		 System.out.println("Printing a long:"+n);
	 }
	    
	 public static void printn(short n) 
	 {
		 System.out.println("Printing a short:"+n);
	 }
	    
	 public static void printn(byte n) 
	 {
		 System.out.println("Printing a byte:"+n);
	 }
	    
	 public static void printn(char n) 
	 {
		 System.out.println("Printing a char:"+n);
	 }
	    
	 public static void printn(boolean n) 
	 {
		 System.out.println("Printing a boolean:"+n);
	 }
	 
	 public static void main(String[] args) 
		{
		 Different_data_type_method print = new Different_data_type_method();
			print.printn(1);
			print.printn(3.14159f);
			print.printn(2.71828);
			print.printn(123456789L);
			print.printn((short) 32767);
			print.printn((byte) 127);
			print.printn('A');
			print.printn(true);
			
		}
}
