package Module_2;
class A1
{
	void p()
	{
		System.out.println("This is a parent class");
	}
}
class B1 extends A1
{
	void child1()
	{
		System.out.println("This is child1 class");
	}
}
class C1 extends B1
{
	void child2()
	{
		System.out.println("This is child2 class");
	}
}
public class Multilevel 
{
	public static void main(String[] args)
	{
		C1 c =new C1();
		
		c.p();
		c.child1();
		c.child2();
		
	}
}
