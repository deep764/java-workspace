package comd243;

public class Pattern_4 
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=5;i++) 
		{
		    for (int j=1;j<=5-i;j++) 
		    {
		        System.out.print(" ");
		    }
		    for (int k=i;k>=1;k--) 
		    {
		        System.out.print("*"+"");
		    }
		    System.out.println();
		}
	}
}
