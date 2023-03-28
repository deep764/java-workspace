package Module_2;

public class Printintchar_overloding 
{
	public void print(int num, char ch) {
        System.out.println("Printing int and char: " + num + ", " + ch);
    }
    
    public void print(char ch, int num) {
        System.out.println("Printing char and int: " + ch + ", " + num);
    }
    public static void main(String[] args) 
    {
    	Printintchar_overloding println= new Printintchar_overloding();
    	println.print(23,'A');
    	println.print('B',234);
	}
}
