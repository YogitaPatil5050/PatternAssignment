import java.util.Scanner;

public class Pattern24 
{

	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int first = 1;
		int second = 1;
		System.out.print(first+" "+second+" ");
		for(int i = 1; i <= number-2; i++) 
		{
			int sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum+" ");
		}
		System.out.println();
	
	
}
}


