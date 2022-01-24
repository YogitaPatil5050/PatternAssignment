import java.util.Scanner;

public class Pattern27 
{

	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int var = 5;
		for(int i = 1; i <= number; i++)
		{
			System.out.print(var +" ");
			var *= 2;
		}
		System.out.println();
	
}
}

