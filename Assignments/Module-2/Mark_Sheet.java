package Module_2;

abstract class Marks 
{
    abstract double getPercentage();
}

class A extends Marks 
{
    private int marks1;
    private int marks2;
    private int marks3;
    
    public A(int marks1, int marks2, int marks3) 
    {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    public double getPercentage() 
    {
        return (marks1 + marks2 + marks3) / 3.0;
    }
}

class B extends Marks {
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;
    
    public B(int marks1, int marks2, int marks3, int marks4) 
    {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }
    
    public double getPercentage() 
    {
        return (marks1 + marks2 + marks3 + marks4) / 4.0;
    }
}

public class Mark_Sheet 
{
	public static void main(String[] args) 
	{
        A studentA = new A(70, 80, 90);
        B studentB = new B(80, 75, 90, 85);
        
        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}
