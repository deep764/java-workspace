package Module_2;

public class Rect_squ_overloading  
{
	public void calculateArea(int length, int breadth) 
	{
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
    
    // Method to calculate area of a square
    public void calculateArea(int side) 
    {
        int area = side * side;
        System.out.println("The area of the square is: " + area);
    }
    public static void main(String[] args) 
    {
    	Rect_squ_overloading rect_squ = new Rect_squ_overloading();
    	rect_squ.calculateArea(5,10);
    	rect_squ.calculateArea(7);

	}
}
