import java.util.Scanner;

public class Pattern12 
{
	
	public static void main(String[] args) 
	{
			System.out.println("HELLOW WORLD !!!");
			
			System.out.println("Enter n");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				for(int k=n-1;k>=i;k--)
				{
					 System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					 System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=n-1;i>=1;i--)
			{
				for(int k=n;k>i;k--)
				{
					 System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					 System.out.print("*");
				}
				System.out.println();
			}
	
	}
}
