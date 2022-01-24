import java.util.Scanner;

public class Pattern30 
{
	
	public static void main(String[] args) 
	{
		System.out.println("HELLOW WORLD !!!");
	
	System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	for(int i = 1; i <= number; i++)
	{
		System.out.print(i * i+ " ");
	}
	System.out.println(" ");
	}
}
