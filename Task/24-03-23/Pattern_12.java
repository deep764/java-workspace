package comd243;

public class Pattern_12 
{
	public static void main(String[] args) 
	{
        int[][] pattern = new int[5][5];
        for (int i=0;i<5;i++) 
        {
            for (int j=0;j<=i;j++) 
            {
                pattern[i][j]=(i+1)*(i+1);
            }
        }
        for (int i=0;i<5;i++) 
        {
            for (int j=0;j<=i;j++) 
            {
                System.out.print(pattern[i][j]+" ");
            }
            System.out.println();
        }
    }
}