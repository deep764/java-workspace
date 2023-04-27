package Module_2;

class Shape 
{
    public void printShape() 
    {
        System.out.println("This is a shape");
    }
}

class deep extends Shape 
{
    public void printShape() 
    {
        System.out.println("This is a rectangular shape");
    }
}

class Circle extends Shape 
{
    public void printShape() 
    {
        System.out.println("This is a circular shape");
    }
}

class patel extends deep 
{
    public void printSquare() 
    {
        System.out.println("Square is a rectangle");
    }
}
public class Main_Shape 
{
	 public static void main(String[] args) 
	 {
	        patel square = new patel();
	        square.printShape(); 
	        square.printSquare(); 
	    }
}
