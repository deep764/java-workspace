package Module_2;
class Triangle 
{
    int side1, side2, side3;
    //This class is perimeter class
    // define is sides
    public void calculatePerimeter() 
    {
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
    
    //This class is Area class
    //Define is triangle area
    public void calculateArea() 
    {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of the triangle: " + area);
    }
}
public class Triangle_parameter_constructor 
{
	 public static void main(String[] args) 
	 {
	        Triangle triangle = new Triangle();
	        triangle.side1 = 3;
	        triangle.side2 = 4;
	        triangle.side3 = 5;

	        triangle.calculatePerimeter();
	        triangle.calculateArea();
	    }
}
