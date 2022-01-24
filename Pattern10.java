import java.util.Scanner;

public class Pattern10 
{
	
	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 
		
		for(int i=n;i>=1;i--)
		{ 
			for(int j=n;j>=i;j--)
			{
				 System.out.print(" ");
			}
		
			for(int k=1;k<=i;k++)
			{
				 System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				 System.out.print("*");
			}
			System.out.println();
		}
}

}
